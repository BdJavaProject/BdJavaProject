package com.capacity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacity.dao.CapacityInfoDao;
import com.capacity.entity.CapacityInfo;
import com.capacity.service.CapacityInfoService;
import com.sun.xml.xsom.impl.scd.Iterators.Map;

@Service
public class CapacityInfoServiceImpl implements CapacityInfoService {
	
	@Autowired
	CapacityInfoDao capacityInfoDao;

	@Override
	public List<CapacityInfo> findAll() {
		return capacityInfoDao.findAll();
	}

	@Override
	public List<CapacityInfo> findByParam(Map map) {
		return capacityInfoDao.findByParam(map);
	}

	@Override
	public CapacityInfo findById(Integer id) {
		return capacityInfoDao.findById(id);
	}

	@Override
	public List<CapacityInfo> findByTransformerId(String transformerId) {
		return capacityInfoDao.findByTransformerId(transformerId);
	}

}
