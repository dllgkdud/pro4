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
		//전송
		return "check/check6";
	}
	//Hibernate 와 spring form에 의한 검증 - @initbinder와 @hibernate는 같이 사용할 수 없다.
	@RequestMapping(value="check6.do", method=RequestMethod.POST)
	public String postCheck6(@Valid MemberVO memberVO, BindingResult result) throws Exception {
		String path = "check/result6";
		if(result.hasErrors()) {
			path="check/error";
		}
		//전송
		return path;
	}
}
