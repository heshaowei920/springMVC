package com.one.piece.service.impl;

import java.util.List;
import java.util.Map;
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

	public void deleteUser(Long theID) {
		userMapper.deleteUser(theID);
	}

	/**
	 * 查询出全部的User。
	 * @param page 分页页码。
	 * @param pageCount 页数。
	 */
	public List<User> getAllUser(Integer page, Integer pageCount) {
		List<User> users = userMapper.getAllUser(null);
		return users;
	}

	public User getOneUser(Long theID) {
		User user = userMapper.getUser(theID);
		return user;
	}

	/**
	 * 通配查找需要的数据。
	 */
	public List<User> getUserNeeded(Map<String, Object> likeCondition) {
		List<User> users = userMapper.getAllUser(likeCondition);
		return users;
	}

	/**
	 * 级联插入Address
	 */
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public User getUserByUserID(String userID) {
		User user=userMapper.getUserByUserID(userID);
		return user;
	}	

}
