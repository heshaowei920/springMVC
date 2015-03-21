package com.one.piece.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.Mapper;

import com.one.piece.entity.User;


@Mapper(value="userMapper")
public interface UserMapper {
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(Long theID);
	/**
	 * 进行模糊查询
	 * @param likeCondition
	 * @param page
	 * @return
	 */
	public List<User> getAllUser(Map<String,Object> likeCondition);
	public User getUser(Long theID);
	public User getUserByUserID(String userID);
}
