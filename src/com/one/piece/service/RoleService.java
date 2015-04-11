package com.one.piece.service;

import java.util.List;
import com.one.piece.entity.Role;


public interface RoleService {
	public void insert(Role role);
	public void update(Role role);
	public void delete(Long theID);
	public List<Role> select(Role role);
	public Role selectById(Long theID);
}
