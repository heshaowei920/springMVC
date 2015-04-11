package com.one.piece.mapper;

import java.util.List;
import com.one.piece.entity.Role;


public interface RoleMapper {
	public void insertRole(Role role);
	public void updateRole(Role role);
	public void deleteRole(Long theID);
	public List<Role> selectRole(Role role);
	public Role selectRoleById(Long theID);
}
