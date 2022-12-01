package com.naver.dao;

import java.util.List;

import com.naver.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> memberList() throws Exception;
	public MemberDTO memberDetail(String userid) throws Exception;
	public void memberInsert(MemberDTO member) throws Exception;
	public MemberDTO logIn(MemberDTO mdto) throws Exception;
}
