package com.capacity.dao;

import java.util.List;

import com.capacity.entity.UserDevice;

public interface UserDeviceDao {
	
	public List<UserDevice> findByUserId(String user_id);
	
	public void insert(UserDevice userDevice);

}
