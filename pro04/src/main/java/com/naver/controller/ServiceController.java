package com.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/service/*")
public class ServiceController {
	
	@RequestMapping(value="value.do", method=RequestMethod.GET)
	public String serviceRule() throws Exception {
		return "service/value";
	}
	
	@RequestMapping(value="business.do", method=RequestMethod.GET)
	public String serviceBus() throws Exception {
		return "service/business";
	}
	
	@RequestMapping(value="impact.do", method=RequestMethod.GET)
	public String serviceImp() throws Exception {
		return "service/impact";
	}
}
