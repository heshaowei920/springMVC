package com.one.piece.mapper;

import java.util.List;
import com.one.piece.entity.User;


public interface UserMapper {
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(Long theID);
	public List<User> selectUser(User user);
	public User selectUserById(Long theID);
	
	public User selectUserByUserId(String userId);
}
