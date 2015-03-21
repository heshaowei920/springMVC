package com.one.piece.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.one.piece.entity.Right;
import com.one.piece.mapper.RightMapper;
import com.one.piece.service.RightService;

@Service(value="rightService")
public class RightServiceImpl implements RightService{
	
	@Resource
	private RightMapper rightMapper;
	
	
	public void deleteRight(Long theID) {
		rightMapper.deleteRight(theID);
	}
	
	public List<Right> getAllRight(Integer page, Integer pageCount) {
		List<Right> rightList = rightMapper.getAllRight(null);
		return rightList;
	}

	public Right getOneRight(Long theID) {
		Right right = rightMapper.getRight(theID);
		return right;
	}
	
	public List<Right> getRightNeeded(Map<String, Object> likeCondition) {
		List<Right> rightList = rightMapper.getAllRight(likeCondition);
		return rightList;
	}
	
	public void insertRight(Right right) {
		rightMapper.insertRight(right);
	}
	

	public void updateRight(Right right) {
		rightMapper.updateRight(right);
	}

}
