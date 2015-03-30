package com.one.piece.mapper;

import java.util.List;
import java.util.Map;
import com.one.piece.entity.User;


public interface UserMapper {
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(Long theID);
	public List<User> getAllUser(Map<String,Object> likeCondition);
	public User getUser(Long theID);
	public User getUserByUserID(String userID);
}
