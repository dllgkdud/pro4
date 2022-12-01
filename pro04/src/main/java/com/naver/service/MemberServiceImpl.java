package com.naver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.dao.MemberDAO;
import com.naver.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO memberDao;
	
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
	
	//로그인(controller)
	@Override
	public MemberDTO logIn(MemberDTO mdto) throws Exception {
		return memberDao.logIn(mdto);
	}
	
	//로그인(DAO)
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
