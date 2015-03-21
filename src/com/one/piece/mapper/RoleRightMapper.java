package com.one.piece.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.Mapper;

import com.one.piece.entity.RoleRight;

@Mapper(value="roleRightMapper")
public interface RoleRightMapper {
	public void insertRoleRight(RoleRight roleRight);
	public void updateRoleRight(RoleRight roleRight);
	public void deleteRoleRight(Long theID);
	public List<RoleRight> getAllRoleRight(Map<String,Object> likeCondition);
	public RoleRight getRoleRight(Long theID);
}
