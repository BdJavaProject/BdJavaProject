package com.capacity.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacity.dao.SysAppUserDao;
import com.capacity.entity.SysAppUser;
import com.capacity.service.SysAppUserService;

@Service
@SuppressWarnings("rawtypes")
public class SysAppUserServiceImpl implements SysAppUserService {
	
	@Autowired
	SysAppUserDao sysAppUserDao;

	@Override
	public SysAppUser findByUsernameAndPwd(Map map) {
		return sysAppUserDao.findByUsernameAndPwd(map);
	}

	@Override
	public int insert(SysAppUser sysAppUser) {
		return sysAppUserDao.insert(sysAppUser);
	}

	@Override
	public SysAppUser findByToken(Map map) {
		return sysAppUserDao.findByToken(map);
	}
	
	@Override
	public void update(SysAppUser sysAppUser) {
		sysAppUserDao.update(sysAppUser);
	}
	
	@Override
	public List<SysAppUser> findByUsername(String username) {
		return sysAppUserDao.findByUsername(username);
	}

}
