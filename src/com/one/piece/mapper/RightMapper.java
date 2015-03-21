package com.one.piece.mapper;

import java.util.List;
import java.util.Map;
import org.mybatis.spring.annotation.Mapper;
import com.one.piece.entity.Right;

@Mapper(value="rightMapper")
public interface RightMapper {
	public void insertRight(Right right);
	public void updateRight(Right right);
	public void deleteRight(Long theID);
	public List<Right> getAllRight(Map<String,Object> likeCondition);
	public Right getRight(Long theID);
}
