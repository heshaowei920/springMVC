package com.one.piece.service.impl;

import java.util.List;
import com.one.piece.entity.Role;
import com.one.piece.mapper.RoleMapper;
import com.one.piece.service.RoleService;


public class RoleServiceImpl implements RoleService{
    
	private RoleMapper roleMapper;

	public RoleMapper getRoleMapper() {
		return roleMapper;
	}

	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

	@Override
	public void insert(Role role) {
		this.roleMapper.insertRole(role);
	}

	@Override
	public void update(Role role) {
		this.roleMapper.updateRole(role);
	}

	@Override
	public void delete(Long theID) {
		this.roleMapper.deleteRole(theID);
	}

	@Override
	public List<Role> select(Role role) {
		List<Role> list=this.roleMapper.selectRole(role);
		return list;
	}

	@Override
	public Role selectById(Long theID) {
		Role role=this.roleMapper.selectRoleById(theID);
		return role;
	}
}
