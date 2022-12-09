package com.naver.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/naver/*")
public class NaverController {
	
	@RequestMapping(value="profile.do", method=RequestMethod.GET)
	public String naverProf(HttpServletRequest request, HttpServletRequest response, Model model) throws Exception {
		return "naver/profile";
	}
	@RequestMapping(value="history1.do", method=RequestMethod.GET)
	public String naverHist1() throws Exception {
		return "naver/history1";
	}
	@RequestMapping(value="history2.do", method=RequestMethod.GET)
	public String naverHist2() throws Exception {
		return "naver/history2";
	}
	@RequestMapping(value="contact.do", method=RequestMethod.GET)
	public String naverCont() throws Exception {
		return "naver/contact";
	}
}
