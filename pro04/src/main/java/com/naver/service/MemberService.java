package com.naver.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.naver.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList() throws Exception;
	public MemberDTO memberDetail(String userid) throws Exception;
	public void memberInsert(MemberDTO member) throws Exception;
	public MemberDTO signIn(MemberDTO mdto) throws Exception;
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception;
	public boolean logIn(HttpServletRequest request) throws Exception;
	public void memberUpdate(MemberDTO member) throws Exception;
	public void memberDelete(String userid) throws Exception;
}
