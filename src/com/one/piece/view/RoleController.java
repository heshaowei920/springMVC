package com.one.piece.view;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.one.piece.entity.Role;
import com.one.piece.service.RoleService;

@Controller
public class RoleController {
	private RoleService roleService;

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	@RequestMapping("roleList")
	public String roleList(HttpServletRequest req) {
		List<Role> list = roleService.getAllRole(null);
		req.setAttribute("list", list);
		System.out.println("listUser method was invoked..." + new Date());
		return "admin_role_list";
	}

	@RequestMapping(value = "/addRole", method = RequestMethod.GET)
	public String addRole() {
		System.out.println("addUser method was invoked...");
		return "admin_role_add";
	}

	@RequestMapping(value = "saveRole", method = RequestMethod.POST)
	public String saveRole(HttpServletRequest req) {
		String roleName = req.getParameter("roleName");
		Role role = new Role();
		role.setRoleName(roleName);
		roleService.insertRole(role);
		return "redirect:roleList.do";
	}

	@RequestMapping(value = "toUpdateRole", method = RequestMethod.GET)
	public String toUpdateUser(@RequestParam Long uid, HttpServletRequest req) {
		Role role = roleService.getOneRole(uid);
		req.setAttribute("role", role);
		return "role_update";
	}

	@RequestMapping(value = "updateRole", method = RequestMethod.POST)
	public String updateUser(HttpServletRequest req) {
		String roleName = req.getParameter("roleName");
		Role role = new Role();
		role.setRoleName(roleName);

		roleService.updateRole(role);
		return "redirect:listRole.do";
	}

	@RequestMapping(value = "deleteRole", method = RequestMethod.GET)
	public String deleteUser(@RequestParam Long uid) {
		roleService.deleteRole(uid);
		return "redirect:listRole.do";
	}

}
