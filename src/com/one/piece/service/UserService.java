package com.one.piece.service;

import java.util.List;
import java.util.Map;


import com.one.piece.entity.User;


public interface UserService {
	public void insertUser(User user);
	public void deleteUser(Long theID);
	public void updateUser(User user);
	
	public List<User> getAllUser(Integer page, Integer pageCount);
	public List<User> getUserNeeded(Map<String, Object> likeCondition);
	public User getOneUser(Long theID);
	
	public User getUserByUserID(String userID);
}
