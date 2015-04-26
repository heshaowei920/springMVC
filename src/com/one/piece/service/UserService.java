package com.one.piece.service;

import java.util.List;

import com.one.piece.entity.User;


public interface UserService {
	public void insert(User user);
	public void update(User user);
	public void delete(Long theID);
	public List<User> select(User user);
	public User selectById(Long theID);
	public User selectUserByUserId(String userId);
}
