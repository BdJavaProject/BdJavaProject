package com.capacity.dao;

import java.util.List;

import com.capacity.entity.LoadResult;

public interface LoadResultDao {
	
	List<LoadResult> findByTansformerId(String transformerId);

}
