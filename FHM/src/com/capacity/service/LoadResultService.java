package com.capacity.service;

import java.util.List;

import com.capacity.entity.LoadResult;

public interface LoadResultService {
	
	public List<LoadResult> findByTransformerId(String transformerId);

}
