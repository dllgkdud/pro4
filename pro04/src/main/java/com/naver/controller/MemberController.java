package com.naver.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.naver.dto.MemberDTO;
import com.naver.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberService;
	
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
		MemberDTO member = memberService.memberDetail(userid);
		model.addAttribute("member", member);
		return "member/memberDetail";
	}
	
	//회원상세(일반)
	@RequestMapping(value="info.do", method = RequestMethod.GET)
	public String memberInfo(Model model, HttpServletRequest request) throws Exception { 
	String userid = (String) session.getAttribute("sid"); 
	MemberDTO member = memberService.memberDetail(userid); model.addAttribute("member", member); 
	return "member/memberInfo"; 
	}
	
	//회원 가입 - 약관 동의 페이지 로딩
	@RequestMapping(value="agree.do", method=RequestMethod.GET)
	public String getAgree(Model model) throws Exception {
		return "member/agree";
	}
		
	//회원추가(폼)
	@RequestMapping(value="insert.do", method=RequestMethod.GET)
	public String insert(MemberDTO member, Model model) throws Exception {
		return "member/memberInsert";
	}
			
	//회원추가
	@RequestMapping(value="insert.do", method=RequestMethod.POST)
	public String memberInsert(MemberDTO member, Model model) throws Exception { 
	//비밀번호 암호화
	String userpw = member.getUserpw(); 
	String pwd = pwdEncoder.encode(userpw);
	member.setUserpw(pwd); 
	memberService.memberInsert(member); 
	return "redirect:/"; 
	}
	

	//회원가입(ajax)
	@RequestMapping(value="check.do", method=RequestMethod.POST) 
	public void idCheck(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception { 
		String userid = request.getParameter("userid"); 
		boolean result = false; 
		MemberDTO dto = new MemberDTO();
		dto = memberService.memberDetail(userid);
		
		//존재하는 아이디
		if(dto!=null) {
			result = false;
		//존재하지 않는 아이디
		} else {
			result = true;
		}
		
		//JSON object
		JSONObject json = new JSONObject();
		json.put("result", result);
		PrintWriter out = response.getWriter();
		out.println(json.toString());
	}

	
	//로그인(폼)
	@RequestMapping("loginForm.do")
	public String loginForm(Model model) throws Exception {
		return "member/memberLogin";
	}
	

	//로그인(controller)
	@RequestMapping(value="signin.do", method=RequestMethod.POST) 
	public String memberSignin(@RequestParam String userid, @RequestParam String userpw,
	HttpServletRequest request, RedirectAttributes rttr) throws Exception {
		session.invalidate(); 
		MemberDTO mdto = new MemberDTO();
		mdto.setUserpw(userpw); 
		mdto.setUserid(userid); 
		MemberDTO login = memberService.signIn(mdto); 
		boolean loginSuccess = pwdEncoder.matches(mdto.getUserpw(), login.getUserpw()); 
		if(loginSuccess && login!=null) { 
		session.setAttribute("member", login);
		session.setAttribute("sid", userid); 
		return "redirect:/"; 
		} else { 
		return "redirect:loginForm.do"; 
		} 
	}
	
	//로그인(service)
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String memberLogin(MemberDTO mdto, HttpServletRequest request, RedirectAttributes rttr) throws Exception {
		boolean loginSuccess = memberService.logIn(request);
		if(loginSuccess) {
			return "home";
		} else {
			return "redirect:loginForm.do";
		}
	}
	
	//로그인(Ajax)
	@RequestMapping(value="loginCheck.do", method = RequestMethod.POST)
	public String memberLoginCtrl(MemberDTO mdto, RedirectAttributes rttr) throws Exception { 
		session.getAttribute("member"); 
	 	MemberDTO member = memberService.loginCheck(mdto);
	 	boolean mat = pwdEncoder.matches(mdto.getUserpw(), member.getUserpw()); 
	 	if(mat==true && member!=null) { 
	 		logger.info("로그인 성공"); 
	 		session.setAttribute("member", member); 
	 		session.setAttribute("sid", member.getUserid());
	 		rttr.addFlashAttribute("msg", "로그인 성공"); 
	 		return "redirect:/"; 
	 	} else {
	 		logger.info("로그인 실패"); session.setAttribute("member", null);
	 		rttr.addFlashAttribute("msg", false); 
	 		return "redirect:loginForm.do"; 
	 	}
	}
	
	//회원수정
	@RequestMapping(value="update.do", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO member, Model model) throws Exception {
		String pwd = pwdEncoder.encode(member.getUserpw());
		member.setUserpw(pwd);
		memberService.memberUpdate(member);
		return "redirect:/";
	}
	
	//로그아웃
	@RequestMapping("logout.do")
	public String memberLogout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:/";
	}
}
