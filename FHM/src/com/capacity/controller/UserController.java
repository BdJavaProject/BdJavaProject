package com.capacity.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capacity.entity.SysUser;
import com.capacity.response.BaseResponse;
import com.capacity.response.LoginRespose;
import com.capacity.response.entity.LoginResponseEntity;
import com.capacity.service.SysUserService;
import com.capacity.util.MD5Util;
import com.capacity.util.WorkerUtil;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	SysUserService sysUserService;

	/**
	 * 用户登陆
	 * @param username
	 * @param password
	 * @param token
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public Object login(String username, String password, String token,HttpServletRequest request){
		LoginRespose respose = new LoginRespose();
		SysUser user = null;
		if (WorkerUtil.isNullOrEmpty(token)) {
			String pwd = "";
			try {
				pwd = MD5Util.encryp(password);
			} catch (Exception e) {
				respose.setStatus(BaseResponse.REFUSE);
				respose.setMsg("密码转化出错，请重试！");
			}
			logger.info("username="+username+",password="+pwd);
			Map<String, String> map = new HashMap<String, String>();
			map.put("username", username);
			map.put("password", pwd);
			
			String token_t = WorkerUtil.getRandomString(32);//得到32位随机字符串作为更新token值
			user = sysUserService.findByUsernameAndPwd(map);
			if(!WorkerUtil.isNullOrEmpty(user)){
				user.setToken(token_t);
				LoginResponseEntity loginResponseEntity = convertToLoginResponseEntityFromSysAppUser(user);
				respose.setStatus(BaseResponse.OK);
				respose.setMsg(loginResponseEntity);
			}else{
				respose.setStatus(BaseResponse.REFUSE);
				respose.setMsg("用户名或密码错误");
			}
		} else {
			//token两个小时内有效
			Calendar calendar = Calendar.getInstance();
		    calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 2);
			
			Map<String , Object> map = new HashMap<String, Object>();
			map.put("token", token);
			map.put("time", WorkerUtil.formatDatetime(calendar.getTime()));
			user = sysUserService.findByToken(map);
			if(!WorkerUtil.isNullOrEmpty(user)){
				LoginResponseEntity loginResponseEntity = convertToLoginResponseEntityFromSysAppUser(user);
				respose.setStatus(BaseResponse.OK);
				respose.setMsg(loginResponseEntity);
			}else{
				respose.setStatus(BaseResponse.REFUSE);
				respose.setMsg("token值错误或已经失效");
			}
		}
		
		if(BaseResponse.OK.equals(respose.getStatus())){
			request.getSession().setAttribute("user", user);
			String logindate = WorkerUtil.formatDatetime(new Date());
			user.setLast_login(logindate);
			sysUserService.update(user);
		}
		
		return respose;

	}
	
	@RequestMapping(value = "/userNameExist",method = RequestMethod.GET)
	@ResponseBody
	public Object userNameExist(String username){
		LoginRespose respose = new LoginRespose();
		SysUser list = sysUserService.findByUsername(username);
		if(WorkerUtil.isNullOrEmpty(list)){
			respose.setStatus(BaseResponse.OK);
		}else {
			respose.setStatus(BaseResponse.REFUSE);
			respose.setMsg("用户名:"+username+" 已经存在");
		}
		return respose;
	}
	
	private LoginResponseEntity convertToLoginResponseEntityFromSysAppUser(SysUser SysUser){
		LoginResponseEntity loginResponseEntity = new LoginResponseEntity();
		loginResponseEntity.setToken(SysUser.getToken());
		loginResponseEntity.setUser_id(SysUser.getUser_id());
		loginResponseEntity.setUser_name(SysUser.getUsername());
		return loginResponseEntity;
	}
}
