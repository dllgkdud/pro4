package com.naver.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.dto.SampleDTO;

@Repository
public class SampleDAOImpl implements SampleDAO {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<SampleDTO> sampleList() throws Exception {
		return sqlSession.selectList("sample.sampleList");
	}
}
