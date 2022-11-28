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
	
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberDao.memberList();
	}

	@Override
	public MemberDTO getMember(String userid) throws Exception {
		return memberDao.getMember(userid);
	}
}
