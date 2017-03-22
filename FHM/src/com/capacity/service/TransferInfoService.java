package com.capacity.service;

import java.util.List;
import java.util.Map;

import com.capacity.entity.TransferInfo;


public interface TransferInfoService {
	
	public List<TransferInfo> findAll();
	
	public List<TransferInfo> findByCondition(Map map);
	
	public void deleteById(Integer id);
	
	public void deleteByIds(List<Integer> ids);
	
	public List<TransferInfo> findByTransformerId(String transformerId);
}
