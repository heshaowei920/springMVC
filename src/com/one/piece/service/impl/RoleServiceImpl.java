package com.one.piece.service.impl;

import java.util.List;

import com.one.piece.entity.Role;
import com.one.piece.mapper.RoleDao;
import com.one.piece.service.RoleService;


public class RoleServiceImpl implements RoleService{
	private RoleDao roleDao;
	
	
	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	
	

	public void deleteRole(Long theID) {
		roleDao.deleteRole(theID);
	}

	/**
	 * 查询出全部的User。
	 * @param page 分页页码。
	 * @param pageCount 页数。
	 */
	public List<Role> getAllRole(Role role) {
		List<Role> roleList = roleDao.getAllRole(null);
		return roleList;
	}

	public Role getOneRole(Long theID) {
		Role role = roleDao.getRole(theID);
		return role;
	}

	/**
	 * 通配查找需要的数据。
	 */
	public List<Role> getRoleNeeded(Role role) {
		List<Role> roleList = roleDao.getAllRole(role);
		return roleList;
	}

	/**
	 * 级联插入Address
	 */
	public void insertRole(Role role) {
		roleDao.insertRole(role);
	}
	

	public void updateRole(Role role) {
		roleDao.updateRole(role);
	}

}
