package com.one.piece.entity;


public class User {
	private Long theID;
	private String userID;
	private String name;
	private Integer age;
	private String phone;
	private String passWord;
    private String roleID;
    
   
    
    
	public Long getTheID() {
		return theID;
	}
	public void setTheID(Long theID) {
		this.theID = theID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getRoleID() {
		return roleID;
	}
	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User(String userID, String name, Integer age, String phone, String passwd) {
		this.userID = userID;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.passWord = passwd;
	}
	public User(String name, Integer age, String phone, String passwd) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.passWord = passwd;
	}
	public User() {
	}
}
