package com.capacity.service;

import java.util.List;

import com.capacity.entity.NoLoadInfo;

public interface NoLoadInfoService {
	
	public List<NoLoadInfo> findByTransformerId(String transformerId);

}
