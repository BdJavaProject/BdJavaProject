package com.capacity.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capacity.entity.CapacityInfo;
import com.sun.xml.xsom.impl.scd.Iterators.Map;

@Repository
public interface CapacityInfoDao {
	
	public List<CapacityInfo> findAll();
	
	public List<CapacityInfo> findByParam(Map map);
	
	public CapacityInfo findById(Integer id);
	
	public List<CapacityInfo> findByTransformerId(String transfomerId);

}
