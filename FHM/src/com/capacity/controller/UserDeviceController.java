package com.capacity.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capacity.entity.SysUser;
import com.capacity.entity.UserDevice;
import com.capacity.response.BaseResponse;
import com.capacity.response.DeviceResponse;
import com.capacity.response.entity.DeviceResponseEntity;
import com.capacity.service.SysUserService;
import com.capacity.service.UserDeviceService;
import com.capacity.util.WorkerUtil;

@Controller
@RequestMapping(value = "/device")
public class UserDeviceController {
	
	@Autowired
	UserDeviceService userDeviceService;
	@Autowired
	SysUserService sysUserService;
	
	@RequestMapping(value = "/getDeviceIdByUsername", method = RequestMethod.GET)
	@ResponseBody
	public Object getDeviceIdByUsername(String username){
		DeviceResponse response = new DeviceResponse();
		SysUser user = sysUserService.findByUsername(username);
		if(!WorkerUtil.isNullOrEmpty(user)){
			List<UserDevice> list = userDeviceService.findByUserId(user.getUser_id());
			List<DeviceResponseEntity> list2 = new LinkedList<DeviceResponseEntity>();
			for (UserDevice userDevice : list) {
				DeviceResponseEntity entity = new DeviceResponseEntity();
				entity.setDeviceId(userDevice.getDevice_id().toString());
				entity.setUserAddress(user.getAddress());
				entity.setUserName(user.getUsername());
				list2.add(entity);
			}
			response.setStatus(BaseResponse.OK);
			response.setMsg(list2);
		}else {
			response.setStatus(BaseResponse.REFUSE);
			response.setMsg("该用户无设备绑定");
		}
		return response;
	}

}
