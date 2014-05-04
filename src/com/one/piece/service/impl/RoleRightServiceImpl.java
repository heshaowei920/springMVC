package com.one.piece.service.impl;

import java.util.List;
import java.util.Map;

import com.one.piece.dao.RoleRightDao;
import com.one.piece.entity.RoleRight;
import com.one.piece.service.RoleRightService;

public class RoleRightServiceImpl implements RoleRightService{
	private RoleRightDao roleRightDao;
	
	
	
	
	
	
	public RoleRightDao getRoleRightDao() {
		return roleRightDao;
	}

	public void setRoleRightDao(RoleRightDao roleRightDao) {
		this.roleRightDao = roleRightDao;
	}

	public void deleteRoleRight(Long theID) {
		roleRightDao.deleteRoleRight(theID);
	}

	/**
	 * 查询出全部的RoleRight。
	 * @param page 分页页码。
	 * @param pageCount 页数。
	 */
	public List<RoleRight> getAllRoleRight(Integer page, Integer pageCount) {
		List<RoleRight> RoleRights = roleRightDao.getAllRoleRight(null);
		return RoleRights;
	}

	public RoleRight getOneRoleRight(Long theID) {
		RoleRight RoleRight = roleRightDao.getRoleRight(theID);
		return RoleRight;
	}

	/**
	 * 通配查找需要的数据。
	 */
	public List<RoleRight> getRoleRightNeeded(Map<String, Object> likeCondition) {
		List<RoleRight> RoleRights = roleRightDao.getAllRoleRight(likeCondition);
		return RoleRights;
	}

	/**
	 * 级联插入Address
	 */
	public void insertRoleRight(RoleRight roleRight) {
		roleRightDao.insertRoleRight(roleRight);
	}

	public void updateRoleRight(RoleRight roleRight) {
		roleRightDao.updateRoleRight(roleRight);
	}	

}
