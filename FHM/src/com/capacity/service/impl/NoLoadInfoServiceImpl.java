package com.capacity.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.capacity.dao.NoLoadInfoDao;
import com.capacity.entity.NoLoadInfo;
import com.capacity.service.NoLoadInfoService;

@Service
public class NoLoadInfoServiceImpl implements NoLoadInfoService {

	@Resource
	private NoLoadInfoDao noLoadInfoDao;
	@Override
	public List<NoLoadInfo> findByTransformerId(String transformerId) {
		return noLoadInfoDao.findByTransformerId(transformerId);
	}

	
}
