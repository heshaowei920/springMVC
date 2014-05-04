package com.one.piece.service;

import java.util.List;
import java.util.Map;

import com.one.piece.entity.RoleRight;

public interface RoleRightService {
	public void insertRoleRight(RoleRight roleRight);
	public void deleteRoleRight(Long theID);
	public void updateRoleRight(RoleRight roleRight);
	
	public List<RoleRight> getAllRoleRight(Integer page, Integer pageCount);
	public List<RoleRight> getRoleRightNeeded(Map<String, Object> likeCondition);
	public RoleRight getOneRoleRight(Long theID);
}
