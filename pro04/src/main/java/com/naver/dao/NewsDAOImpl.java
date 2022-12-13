package com.naver.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.dto.NewsDTO;

@Repository
public class NewsDAOImpl implements NewsDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<NewsDTO> newsList() throws Exception {
		return sqlSession.selectList("news.newsList");
	}

	@Override
	public NewsDTO newsDetail(int nno) throws Exception {
		return sqlSession.selectOne("news.newsDetail", nno);
	}

	@Override
	public void newsInsert(NewsDTO dto) throws Exception {
		sqlSession.insert("news.newsInsert", dto);
	}

	@Override
	public void newsDelete(int nno) throws Exception {
		sqlSession.delete("news.newsDelete", nno);
	}

	@Override
	public void newsUpdate(NewsDTO dto) throws Exception {
		sqlSession.update("news.newsUpdate", dto);
	}
}
