package com.one.piece.action;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.one.piece.entity.User;
import com.one.piece.mapper.UserMapper;
import com.one.piece.service.UserService;
import com.one.piece.service.impl.UserServiceImpl;

public class UesrAction {
	private UserMapper userMapper;
   
	private UserService userService;
	@Before
	public void before() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring_config/applicationContext.xml",
						"classpath:mybatis_config.xml","classpath:spring_config/applicationContext-bean.xml"});
		userMapper = (UserMapper) context.getBean("userMapper");
		userService = (UserService) context.getBean("userService");
	}
	
	@Test
	public void addUser() {
		User user = new User();
		user.setName("11");
		userService.insertUser(user);
		System.out.println(userMapper);
		List<User> list=userService.getAllUser(null,null);
	}
}
