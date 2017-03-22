package com.capacity.response.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginResponseEntity implements Serializable{

	private String token;
	private String user_id;
	private String user_name;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}
