package com.one.piece.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.one.piece.entity.RoleRight;
import com.one.piece.mapper.RoleRightMapper;
import com.one.piece.service.RoleRightService;

@Service(value="roleRightService")
public class RoleRightServiceImpl implements RoleRightService{
	@Resource
	private RoleRightMapper roleRightMapper;
	

	public void deleteRoleRight(Long theID) {
		roleRightMapper.deleteRoleRight(theID);
	}
	
	public List<RoleRight> getAllRoleRight(Integer page, Integer pageCount) {
		List<RoleRight> RoleRights = roleRightMapper.getAllRoleRight(null);
		return RoleRights;
	}

	public RoleRight getOneRoleRight(Long theID) {
		RoleRight RoleRight = roleRightMapper.getRoleRight(theID);
		return RoleRight;
	}
	
	public List<RoleRight> getRoleRightNeeded(Map<String, Object> likeCondition) {
		List<RoleRight> RoleRights = roleRightMapper.getAllRoleRight(likeCondition);
		return RoleRights;
	}
	
	public void insertRoleRight(RoleRight roleRight) {
		roleRightMapper.insertRoleRight(roleRight);
	}

	public void updateRoleRight(RoleRight roleRight) {
		roleRightMapper.updateRoleRight(roleRight);
	}	

}
