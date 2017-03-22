package com.capacity.service;

import java.util.List;

import com.capacity.entity.UserDevice;

public interface UserDeviceService {

	public List<UserDevice> findByUserId(String user_id);

	public void insert(UserDevice userDevice);
}
