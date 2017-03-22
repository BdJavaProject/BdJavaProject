package com.capacity.dao;

import java.util.List;

import com.capacity.entity.NoLoadInfo;

public interface NoLoadInfoDao {
	
	List<NoLoadInfo> findByTransformerId(String transformerId);

}
