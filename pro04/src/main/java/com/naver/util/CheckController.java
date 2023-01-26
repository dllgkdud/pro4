package com.naver.util;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/check/*")
public class CheckController {
	
	@RequestMapping(value="check1", method=RequestMethod.GET)
	public String getCheck1(HttpServletRequest request, Model model) throws Exception {

		return "check/check1";
	}

	@RequestMapping(value="check1", method=RequestMethod.POST)
	public String postCheck1(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "check/result1";
	}
	
	@RequestMapping(value="check2", method=RequestMethod.GET)
	public String getCheck2(HttpServletRequest request, Model model) throws Exception {

		return "check/check2";
	}

	@RequestMapping(value="check2", method=RequestMethod.POST)
	public String postCheck2(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "check/result2";
	}
	
	@RequestMapping(value="check3", method=RequestMethod.GET)
	public String getCheck3(HttpServletRequest request, Model model) throws Exception {
		return "check/check3";
	}

	@RequestMapping(value="check3.do", method=RequestMethod.GET)
	public String postCheck3(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) throws Exception {

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "check/result3";
	}
	
	@RequestMapping(value="check4", method=RequestMethod.GET)
	public String getCheck4(HttpServletRequest request, Model model) throws Exception {
		return "check/check4";
	}
	//Validator
	@RequestMapping(value="check4", method=RequestMethod.POST)
	public String postCheck4(@ModelAttribute("member") Member member, Model model, BindingResult result) throws Exception {
		String page = "check/result4";
		MemberValidator userValidator = new MemberValidator();
		userValidator.validate(member, result);
		
		if(result.hasErrors()) {
			page = "check/error";
		}
		return page;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new MemberValidator());
	}
	
	@RequestMapping(value="check5", method=RequestMethod.GET)
	public String getCheck5(HttpServletRequest request, Model model) throws Exception {
		return "check/check5";
	}

	@RequestMapping(value="check5", method=RequestMethod.POST)
	public String postCheck5(@ModelAttribute("member") @Valid Member member, Model model, BindingResult result) throws Exception {
		String path = "check/error";
		if(result.hasErrors()) {
			path = "check/error";
		}
		return path;
	}
}
