package com.one.piece.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.one.piece.entity.Role;
import com.one.piece.mapper.RoleMapper;
import com.one.piece.service.RoleService;

@Service(value="roleService")
public class RoleServiceImpl implements RoleService{
	
	@Resource
	private RoleMapper roleMapper;
	
	
	

	public void deleteRole(Long theID) {
		roleMapper.deleteRole(theID);
	}
	
	public List<Role> getAllRole(Role role) {
		List<Role> roleList = roleMapper.getAllRole(null);
		return roleList;
	}

	public Role getOneRole(Long theID) {
		Role role = roleMapper.getRole(theID);
		return role;
	}
	
	public List<Role> getRoleNeeded(Role role) {
		List<Role> roleList = roleMapper.getAllRole(role);
		return roleList;
	}
	
	public void insertRole(Role role) {
		roleMapper.insertRole(role);
	}
	

	public void updateRole(Role role) {
		roleMapper.updateRole(role);
	}

}
