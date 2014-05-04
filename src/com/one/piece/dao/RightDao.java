package com.one.piece.dao;

import java.util.List;
import java.util.Map;
import org.mybatis.spring.annotation.Mapper;
import com.one.piece.entity.Right;

@Mapper("rightDao")
public interface RightDao {
	public void insertRight(Right right);
	public void updateRight(Right right);
	public void deleteRight(Long theID);
	/**
	 * 进行模糊查询
	 * @param likeCondition
	 * @param page
	 * @return
	 */
	public List<Right> getAllRight(Map<String,Object> likeCondition);
	public Right getRight(Long theID);
}
