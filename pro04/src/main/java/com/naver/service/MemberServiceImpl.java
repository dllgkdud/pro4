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
	
	//회원정보
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
}
