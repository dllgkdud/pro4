package com.samsung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.samsung.dto.BoardDTO;
import com.samsung.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	//@RequestMapping(value="list.do", method=RequestMethod.GET)
	@GetMapping("list.do")
	public String getBoardList(Model model) throws Exception {
		List<BoardDTO> boardList = boardService.boardList();
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}
	@GetMapping("detail.do")
	public String getBoardDetail(@RequestParam(value="seq", required=false) int seq, Model model) throws Exception {
		BoardDTO dto = boardService.getBoard(seq);
		model.addAttribute("dto", dto);
		return "board/boardDetail";
	}
}
