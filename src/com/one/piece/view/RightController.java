package com.one.piece.view;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.one.piece.entity.Right;
import com.one.piece.service.RightService;

@Controller
public class RightController {
	private RightService rightService;

	public RightService getRightService() {
		return rightService;
	}

	public void setRightService(RightService rightService) {
		this.rightService = rightService; 
	}

	@RequestMapping("rightList")
	public String rightList(HttpServletRequest req) {
		List<Right> list = rightService.getAllRight(null, null);

		req.setAttribute("list", list);
		System.out.println("listUser method was invoked..." + new Date());
		return "admin_right_list";
	}

	@RequestMapping(value = "addRight", method = RequestMethod.GET)
	public String addRight() {
		System.out.println("addUser method was invoked...");
		return "right_add";
	}

	@RequestMapping(value = "saveRight", method = RequestMethod.POST)
	public String saveRight(HttpServletRequest req) {
		Right right = new Right();
		String rightName = req.getParameter("rightName");
		String rightUrl = req.getParameter("rightUrl");
		String parentID = req.getParameter("parentID");
		right.setRightUrl(rightUrl);
		right.setRightName(rightName);
		right.setParentID(parentID);
		rightService.insertRight(right);

		return "redirect:rightList.do";
	}

	@RequestMapping(value = "toUpdateRight", method = RequestMethod.GET)
	public String toUpdateRight(@RequestParam Long uid, HttpServletRequest req) {
		Right right = rightService.getOneRight(uid);
		req.setAttribute("right", right);
		return "right_update";
	}

	@RequestMapping(value = "updateRight", method = RequestMethod.POST)
	public String updateUser(HttpServletRequest req) {
		Right right = new Right();
		String rightName = req.getParameter("rightName");
		String rightUrl = req.getParameter("rightUrl");
		String parentID = req.getParameter("parentID");
		String theID = req.getParameter("theID");
		right.setRightUrl(rightUrl);
		right.setRightName(rightName);
		right.setParentID(parentID);
		right.setTheID(Long.parseLong(theID));
		rightService.updateRight(right);
		return "redirect:rightList.do";
	}

	@RequestMapping(value = "deleteRight", method = RequestMethod.GET)
	public String deleteRight(@RequestParam Long uid) {
		rightService.deleteRight(uid);
		return "redirect:rightList.do";
	}

}
