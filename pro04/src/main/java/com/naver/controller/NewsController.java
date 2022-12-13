package com.naver.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.naver.dto.NewsDTO;
import com.naver.service.NewsService;

@Controller
@RequestMapping("/news/*")
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	@GetMapping("list.do")
	public String getNewsList(Model model) throws Exception {
		List<NewsDTO> newsList = newsService.newsList();
		model.addAttribute("newsList", newsList);
		return "news/newsList";
	}
	
	@GetMapping("detail.do")
	public String getNewsDetail(HttpServletRequest request, Model model) throws Exception {
		int nno = Integer.parseInt(request.getParameter("nno"));
		NewsDTO dto = newsService.newsDetail(nno);
		model.addAttribute("dto", dto);
		return "news/newsDetail";
	}
	
	@GetMapping("insert.do")
	public String insert(HttpServletRequest request, Model model) throws Exception {
		return "news/newsInsert";
	}
	
	@PostMapping("insert.do")
	public String newsInsert(HttpServletRequest request, Model model) throws Exception {
		NewsDTO dto = new NewsDTO();
		dto.setNtitle(request.getParameter("ntitle"));
		dto.setNcontent(request.getParameter("ncontent"));
		newsService.newsInsert(dto);
		return "redirect:list.do";
	}
	
	//ckeditor
	@RequestMapping(value="imgUpload.do", method=RequestMethod.POST)
	public void imgUpload(HttpServletRequest request, HttpServletResponse response, MultipartHttpServletRequest multiFile, 
	@RequestParam MultipartFile upload) throws Exception {

		UUID uid = UUID.randomUUID();
		OutputStream out = null;
		PrintWriter printWriter = null;
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		try {
			String fileName = upload.getOriginalFilename();
			byte[] bytes = upload.getBytes();
			
			String path = "D:\\lhy\\pro04\\pro04\\src\\main\\webapp\\resources\\upload" + "ckImg/";
			String ckUploadPath = path + uid + "_" + fileName;
			File folder = new File(path);
			System.out.println("path: "+path);
			
			if(!folder.exists()) {
				try {
					folder.mkdirs();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			out = new FileOutputStream(new File(ckUploadPath));
			out.write(bytes);
			//outputStream
			out.flush();
			
			String callback = request.getParameter("CKEditorFuncNum");
			printWriter = response.getWriter();
			String fileUrl = "/news/ckImgSubmit.do?uid="+uid+"&fileName="+fileName;
			
			printWriter.println("{\"filename\" : \""+fileName+"\", \"uploaded\" : 1, \"url\":\""+fileUrl+"\"}");
			printWriter.flush();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null) { out.close(); }
				if(printWriter!=null) { printWriter.close(); }
			} catch(IOException e) { e.printStackTrace(); }
		}
		return;
	}
	
	//ckeditor 
	@RequestMapping(value="ckImgSubmit.do")
	public void ckImgSubmit(@RequestParam(value="uid") String uid, @RequestParam(value="fileName") String fileName, 
	HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = "D:\\lhy\\pro04\\pro04\\src\\main\\webapp\\resources\\upload" + "ckImg/";
		System.out.println("path: "+path);
		String sDirPath = path + uid + "_" + fileName;
		
		File imgFile = new File(sDirPath);
		
		if(imgFile.isFile()) {
			byte[] buf = new byte[1024];
			int readByte = 0;
			int length = 0;
			byte[] imgBuf = null;
			
			FileInputStream fileInputStream = null;
			ByteArrayOutputStream outputStream = null;
			ServletOutputStream out = null;
			
			try {
				fileInputStream = new FileInputStream(imgFile);
				outputStream = new ByteArrayOutputStream();
				out = response.getOutputStream();
				
				while((readByte = fileInputStream.read(buf)) != -1) {
					outputStream.write(buf, 0, readByte);
				}
				
				imgBuf = outputStream.toByteArray();
				length = imgBuf.length;
				out.write(imgBuf, 0, length);
				out.flush();
				
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				outputStream.close();
				fileInputStream.close();
				out.close();
			}
		}
	}
	
	@GetMapping("delete.do")
	public String boardDelete(HttpServletRequest request, Model model) throws Exception {
		int nno = Integer.parseInt(request.getParameter("nno"));
		newsService.newsDelete(nno);
		return "redirect:list.do";
	}
	
	@GetMapping("update.do")
	public String update(HttpServletRequest request, Model model) throws Exception {
		int nno = Integer.parseInt(request.getParameter("nno"));
		NewsDTO dto = newsService.newsDetail(nno);
		model.addAttribute("dto", dto);
		return "news/newsUpdate";
	}
	@PostMapping("update.do")
	public String boardUpdate(HttpServletRequest request, Model model) throws Exception {
		int dno = Integer.parseInt(request.getParameter("dno"));
		NewsDTO dto = new NewsDTO();
		dto.setNno(dno);
		dto.setNtitle(request.getParameter("ntitle"));
		dto.setNcontent(request.getParameter("ncontent"));
		newsService.newsUpdate(dto);
		return "redirect:list.do";
	}
}
