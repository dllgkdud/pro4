package com.naver.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.naver.dao.MemberDAO;
import com.naver.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO memberDao;
	
	@Inject
	BCryptPasswordEncoder pwdEncoder;
	
	//회원목록
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberDao.memberList();
	}
	
	//회원상세
	@Override
	public MemberDTO memberDetail(String userid) throws Exception {
		return memberDao.memberDetail(userid);
	}
	
	//회원가입
	@Override
	public void memberInsert(MemberDTO member) throws Exception {
		memberDao.memberInsert(member);
	}
	
	//로그인(DAO)
	@Override
	public boolean logIn(HttpServletRequest request) throws Exception {
		//로그인 확인 및 세션 저장
		HttpSession session = request.getSession();
		boolean loginSuccess = false;
		MemberDTO mdto = new MemberDTO();
		
		mdto.setUserid(request.getParameter("userid"));
		mdto.setUserpw(request.getParameter("userpw"));
		
		//로그인 정보 바인딩(암호화)
		MemberDTO login = memberDao.logIn(mdto);
		loginSuccess = pwdEncoder.matches(mdto.getUserpw(), login.getUserpw());
		if(login!=null && loginSuccess==true) {
			session.setAttribute("member", login);
			session.setAttribute("sid", login.getUserid());
			loginSuccess = true;
		}
		return loginSuccess;
	}
	
	//로그인(controller)
	@Override
	public MemberDTO signIn(MemberDTO mdto) throws Exception {
		return memberDao.signIn(mdto);
	}
	
	//로그인(ajax)
	@Override
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception {
		return memberDao.loginCheck(mdto);
	}
	
	//회원수정
	@Override
	public void memberUpdate(MemberDTO member) throws Exception {
		memberDao.memberUpdate(member);
	}
	
	//회원삭제(탈퇴)
	@Override
	public void memberDelete(String userid) throws Exception {
		memberDao.memberDelete(userid);
	}
}
