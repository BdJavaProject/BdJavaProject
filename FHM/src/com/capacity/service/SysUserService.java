package com.capacity.service;

import java.util.List;
import java.util.Map;

import com.capacity.entity.SysUser;

@SuppressWarnings("rawtypes")
public interface SysUserService {

	public SysUser findByUsernameAndPwd(Map map);

	public SysUser findByToken(Map map);

	public int insert(SysUser sysAppUser);

	public void update(SysUser sysAppUser);

	public SysUser findByUsername(String username);

}
