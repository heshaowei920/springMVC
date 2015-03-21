package com.one.piece.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.Mapper;

import com.one.piece.entity.RoleRight;

public interface RoleRightDao {
	public void insertRoleRight(RoleRight roleRight);
	public void updateRoleRight(RoleRight roleRight);
	public void deleteRoleRight(Long theID);
	/**
	 * 进行模糊查询
	 * @param likeCondition
	 * @param page
	 * @return
	 */
	public List<RoleRight> getAllRoleRight(Map<String,Object> likeCondition);
	public RoleRight getRoleRight(Long theID);
}
