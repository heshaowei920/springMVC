package com.one.piece.service;

import java.util.List;
import java.util.Map;

import com.one.piece.entity.Role;

public interface RoleService {
	public void insertRole(Role role);
	public void deleteRole(Long theID);
	public void updateRole(Role role);
	
	public List<Role> getAllRole(Integer page, Integer pageCount);
	public List<Role> getRoleNeeded(Map<String, Object> likeCondition);
	public Role getOneRole(Long theID);
}
