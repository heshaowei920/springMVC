package com.one.piece.view;

import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.one.piece.entity.User;
import com.one.piece.service.UserService;

@Controller
public class UserController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "userLogin", method = RequestMethod.POST)
	public String userLogin(HttpServletRequest request) throws Exception {

		String userID = request.getParameter("userID");
		String pass = request.getParameter("password");
		User user = userService.getUserByUserID(userID);
		if (!pass.equals(user.getPassWord())) {
			throw new Exception("sssss");
		}

		request.getSession().setAttribute("user", user);
		return "../main";
	}

	@RequestMapping(value = "checkUser", method = RequestMethod.POST)
	public void checkUser(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			String userID = request.getParameter("userID");
			String pass = request.getParameter("password");
			User user = userService.getUserByUserID(userID);
			String msg = "";
			if (user != null) {
				if (!pass.equals(user.getPassWord())) {
					System.out.println("ssss");
					msg = "密码不正确";
				} else {
					msg = "success";
				}
			} else {
				msg = "用户不存在";
			}
			PrintWriter write = response.getWriter();
			write.print(msg);
			write.flush();
			write.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

	}

	@RequestMapping("listUser")
	public String listUser(HttpServletRequest req) {
		List<User> users = userService.getAllUser(null, null);
		System.out.println("user count : " + users.size());
		req.setAttribute("users", users);
		System.out.println("listUser method was invoked..." + new Date());
		return "listUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser() {
		System.out.println("addUser method was invoked...");
		return "addUser";
	}

	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public String saveUser(HttpServletRequest req) {
		User user = initUser(req);
		System.out.println("ffffffffffff");
		userService.insertUser(user);
		System.out.println("ffffffffffff");
		req.getSession().setAttribute("user", user);
		return "redirect:listUser.do";
	}

	@RequestMapping(value = "toUpdateUser", method = RequestMethod.GET)
	public String toUpdateUser(@RequestParam Long uid, HttpServletRequest req) {
		User user = userService.getOneUser(uid);
		req.setAttribute("user", user);
		return "updateUser";
	}

	@RequestMapping(value = "updateUser", method = RequestMethod.POST)
	public String updateUser(HttpServletRequest req) {
		User user = initUser(req);
		userService.updateUser(user);
		return "redirect:listUser.do";
	}

	@RequestMapping(value = "deleteUser", method = RequestMethod.GET)
	public String deleteUser(@RequestParam Long uid) {
		userService.deleteUser(uid);
		return "redirect:listUser.do";// 重定向到listUser.do
	}

	/**
	 * 获得Ajax异步请求，并将请求数据以JSON格式响应。
	 * 
	 * @param name
	 *            Reuqest中的name参数。
	 * @param age
	 *            Reuqest中的age参数。
	 * @param phone
	 *            Reuqest中的phone参数。
	 * @return List<User> 返回的包含User对象的集合对象在标注的作用下生成JSON字符串响应。
	 */
	@RequestMapping(value = "ajaxGetUser", method = RequestMethod.GET)
	public @ResponseBody
	List<User> ajaxGetUser(@RequestParam String name,
			@RequestParam Integer age, @RequestParam String phone) {
		Map<String, Object> likeCondition = new HashMap<String, Object>();
		if (name != null && name.length() > 0) {
			likeCondition.put("name", "%" + name + "%");
		}
		if (age != null) {
			likeCondition.put("age", age);
		}
		if (phone != null && phone.length() > 0) {
			likeCondition.put("phone", "%" + phone + "%");
		}
		List<User> users = userService.getUserNeeded(likeCondition);
		System.out.println(users.size() + "==========" + name + "===" + age
				+ "===" + phone + "===" + likeCondition.size());
		return users;
	}

	private User initUser(HttpServletRequest req) {
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String age = req.getParameter("age");
		String passwd = req.getParameter("passwd");
		String userID = req.getParameter("userID");

		System.out.println("测试");
		System.out.println(name + "---" + phone + "---" + age + "---" + passwd);

		User user = new User(userID, name, Integer.parseInt(age), phone, passwd);
		String uid = req.getParameter("uid");
		if (uid != null) {
			user.setTheID(Long.parseLong(uid));
		}
		return user;
	}

}
