package com.one.piece.service.impl;

import java.util.List;
import java.util.Map;

import com.one.piece.dao.UserDao;
import com.one.piece.entity.User;
import com.one.piece.service.UserService;


public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void deleteUser(Long theID) {
		userDao.deleteUser(theID);
	}

	/**
	 * 查询出全部的User。
	 * @param page 分页页码。
	 * @param pageCount 页数。
	 */
	public List<User> getAllUser(Integer page, Integer pageCount) {
		List<User> users = userDao.getAllUser(null);
		return users;
	}

	public User getOneUser(Long theID) {
		User user = userDao.getUser(theID);
		return user;
	}

	/**
	 * 通配查找需要的数据。
	 */
	public List<User> getUserNeeded(Map<String, Object> likeCondition) {
		List<User> users = userDao.getAllUser(likeCondition);
		return users;
	}

	/**
	 * 级联插入Address
	 */
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public User getUserByUserID(String userID) {
		User user=userDao.getUserByUserID(userID);
		return user;
	}	

}
