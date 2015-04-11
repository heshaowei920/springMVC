package com.one.piece.mapper;

import java.util.List;
import com.one.piece.entity.Right;


public interface RightMapper {
	public void insertRight(Right right);
	public void updateRight(Right right);
	public void deleteRight(Long theID);
	public List<Right> selectRight(Right right);
	public Right selectRightById(Long theID);
}
