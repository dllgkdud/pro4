package com.samsung.service;

import java.util.List;

import com.samsung.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> boardList() throws Exception;
	public BoardDTO getBoard(int seq) throws Exception;
}
