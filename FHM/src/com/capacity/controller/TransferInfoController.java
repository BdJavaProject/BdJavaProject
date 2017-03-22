package com.capacity.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capacity.entity.CapacityInfo;
import com.capacity.entity.LoadResult;
import com.capacity.entity.NoLoadInfo;
import com.capacity.entity.TransferInfo;
import com.capacity.response.BaseResponse;
import com.capacity.response.CapacityResponse;
import com.capacity.response.DetailResponse;
import com.capacity.response.entity.DetailResponseEntity;
import com.capacity.response.entity.TransferInfoResponseEntity;
import com.capacity.service.CapacityInfoService;
import com.capacity.service.LoadResultService;
import com.capacity.service.NoLoadInfoService;
import com.capacity.service.TransferInfoService;
import com.capacity.util.WorkerUtil;

@Controller
@RequestMapping(value = "/capacity")
public class TransferInfoController {
	
	Logger logger = Logger.getLogger(TransferInfoController.class);
	
	@Autowired
	TransferInfoService transferInfoService;
	
	@Autowired
	CapacityInfoService capacityInfoService;
	
	@Autowired
	LoadResultService loadResultService;
	
	@Autowired
	NoLoadInfoService noLoadInfoService;
	
	@RequestMapping(value = "/capacity", method = RequestMethod.GET)
	@ResponseBody
	public Object findCapacity(){
		CapacityResponse response = new CapacityResponse();
		try{
			List<TransferInfo> list = transferInfoService.findAll();
			List<TransferInfoResponseEntity> entities = convertToTransferInfoResponseEntitiesFromList(list);
			response.setStatus(BaseResponse.OK);
			response.setMsg(entities);
		}catch(Exception e){
			logger.info(e.getMessage(),e);
			response.setStatus(BaseResponse.REFUSE);
		}
		return response;
	}
	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	@ResponseBody
	public Object findCapacityByStartAndEndDate(String startTime, String endTime,String transformerId, String name ){
		CapacityResponse response = new CapacityResponse();
		Map<String ,Object> map = new HashMap<String ,Object>();
		try{
			map.put("startTime", startTime);
			map.put("endTime", endTime);
			map.put("transformerId", transformerId);
			map.put("username", name);
			List<TransferInfo> list = transferInfoService.findByCondition(map);
			List<TransferInfoResponseEntity> entities = convertToTransferInfoResponseEntitiesFromList(list);
			response.setStatus(BaseResponse.OK);
			response.setMsg(entities);
		}catch(Exception e){
			logger.info(e.getMessage(),e);
			response.setStatus(BaseResponse.REFUSE);
			response.setMsg(e.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/deleteById", method = RequestMethod.GET)
	@ResponseBody
	public Object deleteById(Integer id){
		CapacityResponse response = new CapacityResponse();
		try {
			transferInfoService.deleteById(id);
			response.setStatus(BaseResponse.OK);
		} catch (Exception e) {
			response.setStatus(BaseResponse.REFUSE);
			response.setMsg(e.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/deleteByIds", method = RequestMethod.GET)
	@ResponseBody
	public Object deleteByIds(@RequestParam("ids")Integer[] ids){
		CapacityResponse response = new CapacityResponse();
		try {
			List<Integer> list = new ArrayList<Integer>();
			Collections.addAll(list, ids);
			if(!WorkerUtil.isNullOrEmpty(list)){
				transferInfoService.deleteByIds(list);
			}else {
				response.setMsg("ids不能为空");
			}
			response.setStatus(BaseResponse.OK);
		} catch (Exception e) {
			response.setStatus(BaseResponse.REFUSE);
			response.setMsg(e.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/getDetailsById",method = RequestMethod.GET)
	@ResponseBody
	public Object getDetailsByTransformId(String id){
		List<TransferInfo> transferInfos = transferInfoService.findByTransformerId(id);
		List<CapacityInfo> capacityInfos = capacityInfoService.findByTransformerId(id);
		List<LoadResult> loadResults = loadResultService.findByTransformerId(id);
		List<NoLoadInfo> noLoadInfos = noLoadInfoService.findByTransformerId(id);
		DetailResponseEntity entity = new DetailResponseEntity();
		entity.setTransformer_info(transferInfos);
		entity.setCapacityInfo(capacityInfos);
		entity.setLoadResult(loadResults);
		entity.setNoloadInfo(noLoadInfos);
		
		DetailResponse detailResponse = new DetailResponse();
		detailResponse.setMsg(entity);
		
		return detailResponse;
	}
	
	private List<TransferInfoResponseEntity> convertToTransferInfoResponseEntitiesFromList(List<TransferInfo> list){
		List<TransferInfoResponseEntity> transferInfoResponseEntities = new LinkedList<TransferInfoResponseEntity>();
		for (TransferInfo transferInfo : list) {
			logger.info(transferInfo.toString());
			TransferInfoResponseEntity  entity = new TransferInfoResponseEntity();
			entity.setTestUser(transferInfo.getTestUser());
			entity.setTransformerId(String.valueOf(transferInfo.getTransformerId().intValue()));
			entity.setUserName(transferInfo.getUserName());
			entity.setUserAddress(transferInfo.getUserAddress());
			entity.setCreateTime(transferInfo.getCreateTime());
			transferInfoResponseEntities.add(entity);
		}
		return transferInfoResponseEntities;
	}
	
	

}
