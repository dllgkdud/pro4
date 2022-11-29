package com.naver.dao;

import java.util.List;

import com.naver.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> memberList() throws Exception;
	public MemberDTO getMember(String userid) throws Exception;
	public void addMember(MemberDTO member) throws Exception;
	public MemberDTO signIn(MemberDTO mdto) throws Exception;
}
