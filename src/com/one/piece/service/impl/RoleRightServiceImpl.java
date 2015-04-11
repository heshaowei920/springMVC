package com.one.piece.service.impl;

import java.util.List;
import com.one.piece.entity.Role;
import com.one.piece.entity.RoleRight;
import com.one.piece.mapper.RoleRightMapper;
import com.one.piece.service.RoleRightService;


public class RoleRightServiceImpl implements RoleRightService{
    
	private RoleRightMapper roleRightMapper;

	public RoleRightMapper getRoleRightMapper() {
		return roleRightMapper;
	}

	public void setRoleRightMapper(RoleRightMapper roleRightMapper) {
		this.roleRightMapper = roleRightMapper;
	}

	@Override
	public void insert(RoleRight roleRight) {
		this.roleRightMapper.insertRoleRight(roleRight);	
	}

	@Override
	public void update(RoleRight roleRight) {
		this.roleRightMapper.updateRoleRight(roleRight);
	}

	@Override
	public void delete(Long theID) {
		this.roleRightMapper.deleteRoleRight(theID);
	}

	@Override
	public List<Role> select(RoleRight roleRight) {
		List<Role> list=this.roleRightMapper.selectRoleRight(roleRight);
		return list;
	}

	@Override
	public Role selectById(Long theID) {
		Role role=this.roleRightMapper.selectRoleRightById(theID);
		return role;
	}

	
	
	
	
	
	

}
