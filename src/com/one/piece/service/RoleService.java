package com.one.piece.service;

import java.util.List;

import com.one.piece.entity.Role;

public interface RoleService {
	public void insertRole(Role role);
	public void deleteRole(Long theID);
	public void updateRole(Role role);
	
	public List<Role> getAllRole(Role role);
	public List<Role> getRoleNeeded(Role role);
	public Role getOneRole(Long theID);
}
