package com.one.piece.service.impl;

import java.util.List;
import com.one.piece.entity.User;
import com.one.piece.mapper.UserMapper;
import com.one.piece.service.UserService;


public class UserServiceImpl implements UserService{
	
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	

	@Override
	public void insert(User user) {
		this.userMapper.insertUser(user);
	}

	@Override
	public void update(User user) {
		this.userMapper.updateUser(user);
	}

	@Override
	public void delete(Long theID) {
		this.userMapper.deleteUser(theID);
	}

	@Override
	public List<User> select(User user) {
		List<User> list=this.userMapper.selectUser(user);
		return list;
	}

	@Override
	public User selectById(Long theID) {
		User user=this.userMapper.selectUserById(theID);
		return user;
	}
	
	
	public User selectUserByUserId(String userId){
		User user=this.userMapper.selectUserByUserId(userId);
		return user;
	}

	

}
