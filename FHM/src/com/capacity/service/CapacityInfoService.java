package com.capacity.service;

import java.util.List;

import com.capacity.entity.CapacityInfo;
import com.sun.xml.xsom.impl.scd.Iterators.Map;

public interface CapacityInfoService {

	public List<CapacityInfo> findAll();

	public List<CapacityInfo> findByParam(Map map);

	public CapacityInfo findById(Integer id);
	
	public List<CapacityInfo> findByTransformerId(String transformerId);

}
