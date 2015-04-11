package com.one.piece.service;

import java.util.List;
import com.one.piece.entity.Right;


public interface RightService {
	public void insert(Right right);
	public void update(Right right);
	public void delete(Long theID);
	public List<Right> select(Right right);
	public Right selectById(Long theID);
}
