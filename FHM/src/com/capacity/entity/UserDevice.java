package com.capacity.entity;

public class UserDevice {

	private Integer id;// int(22) NOT NULL AUTO_INCREMENT COMMENT '用户设备关联表',
	private Integer user_id;// int(22) NOT NULL COMMENT '用户编号',
	private Integer device_id;// int(22) NOT NULL COMMENT '设备编号',
	private Integer device_type;// tinyint(4) NOT NULL COMMENT '设备类型，0：容量测试仪
								// 1：直流电阻测试仪 2：用电检查仪 3：用电稽查仪',

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getDevice_id() {
		return device_id;
	}

	public void setDevice_id(Integer device_id) {
		this.device_id = device_id;
	}

	public Integer getDevice_type() {
		return device_type;
	}

	public void setDevice_type(Integer device_type) {
		this.device_type = device_type;
	}

}
