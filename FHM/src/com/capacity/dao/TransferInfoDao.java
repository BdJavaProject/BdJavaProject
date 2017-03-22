package com.capacity.dao;

import java.util.List;
import java.util.Map;

import com.capacity.entity.TransferInfo;


public interface TransferInfoDao {

	public List<TransferInfo> findAll();
	
	public List<TransferInfo> findByCondition(Map map);
	
	public List<TransferInfo> findByTransformerId(String transformerId);
	
	public void deleteById(Integer id);
	
	public void deleteByIds(List<Integer> ids);
}
