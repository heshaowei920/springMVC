package com.one.piece.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.Mapper;

import com.one.piece.entity.Role;


@Mapper("roleDao")
public interface RoleDao {
	public void insertRole(Role role);
	public void updateRole(Role role);
	public void deleteRole(Long theID);
	
	public List<Role> getAllRole(Role role);
	public Role getRole(Long theID);
}
