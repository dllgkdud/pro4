package com.naver.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.naver.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	}
	
	@Transactional
	@Override
	public BoardDTO boardDetail(int seq) throws Exception {
		sqlSession.update("board.visited", seq);
		return sqlSession.selectOne("board.boardDetail", seq);
	}

	@Override
	public void boardInsert(BoardDTO dto) throws Exception {
		sqlSession.insert("board.boardInsert", dto);
	}

	@Override
	public void boardDelete(int seq) throws Exception {
		sqlSession.delete("board.boardDelete", seq);
	}

	@Override
	public void boardUpdate(BoardDTO dto) throws Exception {
		sqlSession.update("board.boardUpdate",dto);
	}
}
