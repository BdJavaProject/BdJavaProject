package com.capacity.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SysUser implements Serializable {

	private String user_id;// varchar(100) NOT NULL,
	private String username;// varchar(255) NOT NULL,
	private String password;// varchar(255) NOT NULL,
	private String role_id;// varchar(100) DEFAULT NULL COMMENT
							// '权限：０容量测试仪１电阻测试仪　２用电检查仪　３用电稽查仪',
	private String last_login;// varchar(255) DEFAULT NULL,
	private Integer isAdmin;// tinyint(3) NOT NULL DEFAULT '0' COMMENT
							// '是否管理员，0:管理员 1：普通用户',
	private String address;// varchar(55) NOT NULL COMMENT '用户地址',
	private String session_id;// varchar(55) NOT NULL,
	private String token;// varchar(55) NOT NULL COMMENT '签名',

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
