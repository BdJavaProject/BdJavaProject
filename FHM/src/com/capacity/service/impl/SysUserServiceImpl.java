package com.capacity.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacity.dao.SysUserDao;
import com.capacity.entity.SysUser;
import com.capacity.service.SysUserService;

@Service
@SuppressWarnings("rawtypes")
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	SysUserDao sysUserDao;

	@Override
	public SysUser findByUsernameAndPwd(Map map) {
		return sysUserDao.findByUsernameAndPwd(map);
	}

	@Override
	public int insert(SysUser SysUser) {
		return sysUserDao.insert(SysUser);
	}

	@Override
	public SysUser findByToken(Map map) {
		return sysUserDao.findByToken(map);
	}
	
	@Override
	public void update(SysUser SysUser) {
		sysUserDao.update(SysUser);
	}
	
	@Override
	public SysUser findByUsername(String username) {
		return sysUserDao.findByUsername(username);
	}

}
