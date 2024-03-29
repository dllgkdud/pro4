package com.naver.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naver.dto.BoardDTO;
import com.naver.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	//@RequestMapping(value="list.do", method=RequestMethod.GET)
	@GetMapping("list.do")
	public String getBoardList(Model model) throws Exception {
		List<BoardDTO> boardList = boardService.boardList();
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}
	
	@GetMapping("detail.do")	//detail.do?seq=1
	public String getBoardDetail(HttpServletRequest request, Model model) throws Exception {
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardDTO dto = boardService.boardDetail(seq);
		model.addAttribute("dto", dto);
		return "board/boardDetail";
	}
	
	@GetMapping("insert.do")
	public String insert(HttpServletRequest request, Model model) throws Exception {
		return "board/boardInsert";
	}
	@PostMapping("insert.do")
	public String boardInsert(HttpServletRequest request, Model model) throws Exception {
		BoardDTO dto = new BoardDTO();
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardInsert(dto);
		return "redirect:list.do";
	}
	
	@GetMapping("delete.do")
	public String boardDelete(HttpServletRequest request, Model model) throws Exception {
		int seq = Integer.parseInt(request.getParameter("seq"));
		boardService.boardDelete(seq);
		return "redirect:list.do";
	}
	
	@GetMapping("update.do")
	public String update(HttpServletRequest request, Model model) throws Exception {
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardDTO dto = boardService.boardDetail(seq);
		model.addAttribute("dto", dto);
		return "board/boardUpdate";
	}
	
	@PostMapping("update.do")
	public String boardUpdate(HttpServletRequest request, Model model) throws Exception {
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardDTO dto = new BoardDTO();
		dto.setSeq(seq);
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardUpdate(dto);
		return "redirect:list.do";
	}
} 
