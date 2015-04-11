package com.one.piece.entity;


public class Right {
	private Long theID;
	private String code;
	private String name;
    private Long pid;
    private Integer sort;
    
	public Long getTheID() {
		return theID;
	}
	public void setTheID(Long theID) {
		this.theID = theID;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
}
