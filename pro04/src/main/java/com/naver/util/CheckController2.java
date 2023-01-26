package com.naver.util;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/check/*")
public class CheckController2 {
	
	@RequestMapping(value="check6", method=RequestMethod.GET)
	public String getCheck6(MemberVO memberVO) throws Exception {
		//����
		return "check/check6";
	}
	//Hibernate spring form @initbinder @hibernate
	@RequestMapping(value="check6.do", method=RequestMethod.POST)
	public String postCheck6(@Valid MemberVO memberVO, BindingResult result) throws Exception {
		String path = "check/result6";
		if(result.hasErrors()) {
			path="check/error";
		}

		return path;
	}
}
