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
	
	//회원정보
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
}
