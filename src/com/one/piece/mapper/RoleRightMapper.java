package com.one.piece.mapper;

import java.util.List;
import com.one.piece.entity.Role;
import com.one.piece.entity.RoleRight;


public interface RoleRightMapper {
	public void insertRoleRight(RoleRight roleRight);
	public void updateRoleRight(RoleRight roleRight);
	public void deleteRoleRight(Long theID);
	public List<Role> selectRoleRight(RoleRight roleRight);
	public Role selectRoleRightById(Long theID);
}
