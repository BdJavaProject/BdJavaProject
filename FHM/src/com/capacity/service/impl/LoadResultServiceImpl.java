package com.capacity.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.capacity.dao.LoadResultDao;
import com.capacity.entity.LoadResult;
import com.capacity.service.LoadResultService;

@Service
public class LoadResultServiceImpl implements LoadResultService{
	
	@Resource
	private LoadResultDao loadResultDao;

	@Override
	public List<LoadResult> findByTransformerId(String transformerId) {
		return loadResultDao.findByTansformerId(transformerId);
	}

}
