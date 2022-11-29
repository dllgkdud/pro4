package com.naver.service;

import java.util.List;

import com.naver.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList() throws Exception;
	public MemberDTO getMember(String userid) throws Exception;
	public void memberInsert(MemberDTO member) throws Exception;
	public MemberDTO signIn(MemberDTO mdto) throws Exception;
}
