package com.naver.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	//회원목록
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return sqlSession.selectList("member.memberList");
	}
	
	//회원상세
	@Override
	public MemberDTO memberDetail(String userid) {
		return sqlSession.selectOne("member.memberDetail",userid);
	}
	
	//회원가입
	@Override
	public void memberInsert(MemberDTO member) throws Exception {
		sqlSession.insert("member.memberInsert",member);
	}
	
	//로그인(controller)
	@Override
	public MemberDTO logIn(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.logIn", mdto);
	}

	@Override
	public MemberDTO signIn(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.signIn", mdto);
	}

	@Override
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception {
		mdto = sqlSession.selectOne("member.loginCheck", mdto);
		return mdto;
	}

	@Override
	public void memberUpdate(MemberDTO member) throws Exception {
		sqlSession.update("member.memberUpdate", member);
	}

	@Override
	public void memberDelete(String userid) throws Exception {
		sqlSession.delete("member.memberDelete", userid);
	}
}
