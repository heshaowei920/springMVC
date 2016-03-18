package com.one.piece.view;

import com.one.piece.service.RoleRightService;
import org.springframework.stereotype.Controller;
import com.one.piece.service.RightService;

@Controller
public class RightController {
	
	
	private RightService rightService;

	private RoleRightService roleRightService;

	public RoleRightService getRoleRightService() {
		return roleRightService;
	}

	public void setRoleRightService(RoleRightService roleRightService) {
		this.roleRightService = roleRightService;
	}

	public RightService getRightService() {
		return rightService;
	}

	public void setRightService(RightService rightService) {
		this.rightService = rightService;
	}

	
}
