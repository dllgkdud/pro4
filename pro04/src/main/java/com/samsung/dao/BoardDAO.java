package com.samsung.dao;

import java.util.List;

import com.samsung.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> boardList() throws Exception;
	public BoardDTO getBoard(int seq) throws Exception;
}
