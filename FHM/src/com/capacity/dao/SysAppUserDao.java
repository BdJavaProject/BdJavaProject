package com.capacity.dao;

import java.util.List;
import java.util.Map;

import com.capacity.entity.SysAppUser;

@SuppressWarnings("rawtypes") 
public interface SysAppUserDao {

	public SysAppUser findByUsernameAndPwd(Map map);
	
	public SysAppUser findByToken(Map map);

	public int insert(SysAppUser sysAppUser);
	
	public void update(SysAppUser sysAppUser);
	
	public List<SysAppUser> findByUsername(String username);
}
