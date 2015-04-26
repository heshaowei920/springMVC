package com.one.piece.service.impl;

import java.util.List;
import com.one.piece.entity.Right;
import com.one.piece.mapper.RightMapper;
import com.one.piece.service.RightService;


public class RightServiceImpl implements RightService{
    
	private RightMapper rightMapper;

	public RightMapper getRightMapper() {
		return rightMapper;
	}

	public void setRightMapper(RightMapper rightMapper) {
		this.rightMapper = rightMapper;
	}
    
	
	/**
	 * 插入功能
	 */
	@Override
	public void insert(Right right) {
		this.rightMapper.insertRight(right);
	}
    
	/**
	 * 更新功能
	 */
	@Override
	public void update(Right right) {
		this.rightMapper.updateRight(right);
	}
    
	
	@Override
	public void delete(Long theID) {
		this.rightMapper.deleteRight(theID);
	}

	@Override
	public List<Right> select(Right right) {
		List<Right> list=this.rightMapper.selectRight(right);
		return list;
	}

	@Override
	public Right selectById(Long theID) {
		Right right=this.rightMapper.selectRightById(theID);
		return right;
	}
	
}
