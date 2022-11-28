package com.naver.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.naver.dto.MemberDTO;
import com.naver.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@Inject
	BCryptPasswordEncoder pwdEncoder;
	
	@Autowired
	HttpSession session;
	
	//member/list.do -> MemberService -> MemberDAO -> MyBatis(memberMapper) -> DB
	//localhost:8092/member/list.do
	//회원목록
	@RequestMapping(value = "list.do", method = RequestMethod.GET)
	public String memberList(Model model) throws Exception {
		List<MemberDTO> memberList = memberService.memberList();
		model.addAttribute("memberList", memberList);
		return "member/memberList";
	}
	
	//localhost:8092/member/getMember.do
	//@RequestMapping(value = "getMember.do", method = RequestMethod.GET)
	//회원상세(관리자)
		@RequestMapping(value="detail.do", method = RequestMethod.GET)
		public String memberDetail(@RequestParam String userid, Model model) throws Exception {
			MemberDTO member = memberService.getMember(userid);
			model.addAttribute("member", member);
			return "member/memberDetail";
		}
	
	//회원상세(일반)
	@RequestMapping(value="info.do", method = RequestMethod.GET)
	public String memberInfo(Model model, HttpServletRequest request) throws Exception {
		String userid = (String) session.getAttribute("sid");
		MemberDTO member = memberService.getMember(userid);
		model.addAttribute("member", member);
		return "member/memberDetail";
	}
	
	//로그인(Ajax)
	/*
	 @RequestMapping(value="loginCheck.do", method = RequestMethod.POST)
	 public String memberLoginCtrl(MemberDTO mdto, RedirectAttributes rttr) throws Exception { 
	 	session.getAttribute("member"); 
	 	MemberDTO member = memberService.loginCheck(mdto); 
	 	boolean mat = pwdEncoder.matches(mdto.getUserpw(), member.getUserpw()); 
	 	if(mat==true && member!=null) { 
	 		logger.info("로그인 성공"); session.setAttribute("member", member); 
	 		session.setAttribute("sid", member.getUserid());
	 		rttr.addFlashAttribute("msg", "로그인 성공"); 
	 		return "redirect:/"; 
	 	} else {
	 		logger.info("로그인 실패"); session.setAttribute("member", null);
	 		rttr.addFlashAttribute("msg", false); return "redirect:login.do"; 
	 	}
	 }
	 */
}
