package com.capacity.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacity.dao.TransferInfoDao;
import com.capacity.entity.TransferInfo;
import com.capacity.service.TransferInfoService;

@Service
@SuppressWarnings("rawtypes")
public class TransferInfoServiceImpl implements TransferInfoService {
	
	@Autowired
	TransferInfoDao transferInfoDao;

	@Override
	public List<TransferInfo> findAll() {
		return transferInfoDao.findAll();
	}

	@Override
	public List<TransferInfo> findByCondition(Map map) {
		return transferInfoDao.findByCondition(map);
	}

	@Override
	public void deleteById(Integer id) {
		transferInfoDao.deleteById(id);
	}

	@Override
	public void deleteByIds(List<Integer> ids) {
		transferInfoDao.deleteByIds(ids);
	}

	@Override
	public List<TransferInfo> findByTransformerId(String transformerId) {
		return transferInfoDao.findByTransformerId(transformerId);
	}

}
