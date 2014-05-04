package com.one.piece.service.impl;

import java.util.List;
import java.util.Map;

import com.one.piece.dao.RightDao;
import com.one.piece.entity.Right;
import com.one.piece.service.RightService;


public class RightServiceImpl implements RightService{
	private RightDao rightDao;

	public RightDao getRightDao() {
		return rightDao;
	}

	public void setRightDao(RightDao rightDao) {
		this.rightDao = rightDao;
	}
	
	
	

	public void deleteRight(Long theID) {
		rightDao.deleteRight(theID);
	}

	/**
	 * 查询出全部的User。
	 * @param page 分页页码。
	 * @param pageCount 页数。
	 */
	public List<Right> getAllRight(Integer page, Integer pageCount) {
		List<Right> rightList = rightDao.getAllRight(null);
		return rightList;
	}

	public Right getOneRight(Long theID) {
		Right right = rightDao.getRight(theID);
		return right;
	}

	/**
	 * 通配查找需要的数据。
	 */
	public List<Right> getRightNeeded(Map<String, Object> likeCondition) {
		List<Right> rightList = rightDao.getAllRight(likeCondition);
		return rightList;
	}

	/**
	 * 级联插入Address
	 */
	public void insertRight(Right right) {
		rightDao.insertRight(right);
	}
	

	public void updateRight(Right right) {
		rightDao.updateRight(right);
	}

}
