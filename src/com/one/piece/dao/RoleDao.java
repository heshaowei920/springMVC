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
	/**
	 * 进行模糊查询
	 * @param likeCondition
	 * @param page
	 * @return
	 */
	public List<Role> getAllRole(Map<String,Object> likeCondition);
	public Role getRole(Long theID);
}
