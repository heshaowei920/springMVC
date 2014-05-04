package com.one.piece.service;

import java.util.List;
import java.util.Map;

import com.one.piece.entity.Right;

public interface RightService {
	public void insertRight(Right right);
	public void deleteRight(Long theID);
	public void updateRight(Right right);
	
	public List<Right> getAllRight(Integer page, Integer pageCount);
	public List<Right> getRightNeeded(Map<String, Object> likeCondition);
	public Right getOneRight(Long theID);
}
