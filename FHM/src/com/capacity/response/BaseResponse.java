package com.capacity.response;

import java.io.Serializable;

public class BaseResponse implements Serializable {
	
	public static final String OK = "OK";
	
	public static final String REFUSE = "refused";

	private String status;

	private Object msg;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getMsg() {
		return msg;
	}

	public void setMsg(Object msg) {
		this.msg = msg;
	}

}
