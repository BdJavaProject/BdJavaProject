package com.capacity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacity.dao.UserDeviceDao;
import com.capacity.entity.UserDevice;
import com.capacity.service.UserDeviceService;

@Service
public class UserDeviceServiceImpl implements UserDeviceService{
	
	@Autowired
	UserDeviceDao userDeviceDao;

	@Override
	public List<UserDevice> findByUserId(String user_id) {
		return userDeviceDao.findByUserId(user_id);
	}

	@Override
	public void insert(UserDevice userDevice) {
		userDeviceDao.insert(userDevice);
	}

}
