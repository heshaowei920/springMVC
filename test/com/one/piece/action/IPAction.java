package com.one.piece.action;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.one.piece.entity.User;
import com.one.piece.mapper.UserMapper;
import com.one.piece.service.UserService;
import com.one.piece.service.impl.UserServiceImpl;

public class IPAction {
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
	
		private String getIpAddr() { 
		String ipAddress = null;  
		   /* 
		      
		     //ipAddress = this.getRequest().getRemoteAddr();   
		     ipAddress = this.getRequest().getHeader("x-forwarded-for");   
		     if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {   
		      ipAddress = this.getRequest().getHeader("Proxy-Client-IP");   
		     }   
		     if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {   
		         ipAddress = this.getRequest().getHeader("WL-Proxy-Client-IP");   
		     }   
		     if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {   
		      ipAddress = this.getRequest().getRemoteAddr();   
		      if(ipAddress.equals("127.0.0.1")){   
		       //根据网卡取本机配置的IP   
		       InetAddress inet=null;   
		    try {   
		     inet = InetAddress.getLocalHost();   
		    } catch (UnknownHostException e) {   
		     e.printStackTrace();   
		    }   
		    ipAddress= inet.getHostAddress();   
		      }   
		            
		     }   
		  
		     //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割   
		     if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15   
		         if(ipAddress.indexOf(",")>0){   
		             ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));   
		         }   
		     }   */
		     return ipAddress;    
		  }   
	
}
