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
	public MemberDTO getMember(String userid) throws Exception {
		return memberDao.getMember(userid);
	}
	
	//회원가입
	@Override
	public void memberInsert(MemberDTO member) throws Exception {
		memberDao.addMember(member);
	}
	
	//로그인(controller)
	@Override
	public MemberDTO signIn(MemberDTO mdto) throws Exception {
		return memberDao.signIn(mdto);
	}
}
