package com.capacity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capacity.service.CapacityInfoService;

@Controller
@RequestMapping(value = "/capacity_1")
public class CapacityInfoController {

	@Autowired
	private CapacityInfoService capacityInfoService;

	@RequestMapping(value = "/capacity", method = RequestMethod.GET)
	@ResponseBody
	public Object findCapacity() {
		return capacityInfoService.findAll();
	}
}
