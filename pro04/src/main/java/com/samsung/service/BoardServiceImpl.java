package com.samsung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samsung.dao.BoardDAO;
import com.samsung.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDAO.boardList();
	}

	@Override
	public BoardDTO getBoard(int seq) throws Exception {
		return boardDAO.getBoard(seq);
	}
}
