package com.one.piece.service;

import java.util.List;
import com.one.piece.entity.Role;
import com.one.piece.entity.RoleRight;


public interface RoleRightService {
	public void insert(RoleRight roleRight);
	public void update(RoleRight roleRight);
	public void delete(Long theID);
	public List<Role> select(RoleRight roleRight);
	public Role selectById(Long theID);
}
