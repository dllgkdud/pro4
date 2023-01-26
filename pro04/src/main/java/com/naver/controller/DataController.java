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

import com.naver.dto.DataDTO;
import com.naver.service.DataService;

@Controller
@RequestMapping("/data/*")
public class DataController {
	
	@Autowired
	private DataService dataService;
	
	//@RequestMapping(value="list.do", method=RequestMethod.GET)
	@GetMapping("list.do")
	public String getDataList(Model model) throws Exception {
		List<DataDTO> dataList = dataService.dataList();
		model.addAttribute("dataList", dataList);
		return "data/dataList";
	}
	
	@GetMapping("detail.do")	//detail.do?dno=1
	public String getDataDetail(HttpServletRequest request, Model model) throws Exception {
		int dno = Integer.parseInt(request.getParameter("dno"));
		DataDTO dto = dataService.dataDetail(dno);
		model.addAttribute("dto", dto);
		return "data/dataDetail";
	}
	
	@GetMapping("insert.do")
	public String insert(HttpServletRequest request, Model model) throws Exception {
		return "data/dataInsert";
	}
	
	@PostMapping("insert.do")
	public String dataInsert(HttpServletRequest request, Model model) throws Exception {
		DataDTO dto = new DataDTO();
		dto.setDtitle(request.getParameter("dtitle"));
		dto.setDcontent(request.getParameter("dcontent"));
		dataService.dataInsert(dto);
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
			
			//String callback = request.getParameter("CKEditorFuncNum");
			printWriter = response.getWriter();

			String fileUrl = "/data/ckImgSubmit.do?uid="+uid+"&fileName="+fileName;
			
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
		int dno = Integer.parseInt(request.getParameter("dno"));
		dataService.dataDelete(dno);
		return "redirect:list.do";
	}
	
	@GetMapping("update.do")
	public String update(HttpServletRequest request, Model model) throws Exception {
		int dno = Integer.parseInt(request.getParameter("dno"));
		DataDTO dto = dataService.dataDetail(dno);
		model.addAttribute("dto", dto);
		return "data/dataUpdate";
	}
	
	@PostMapping("update.do")
	public String boardUpdate(HttpServletRequest request, Model model) throws Exception {
		int dno = Integer.parseInt(request.getParameter("dno"));
		DataDTO dto = new DataDTO();
		dto.setDno(dno);
		dto.setDtitle(request.getParameter("dtitle"));
		dto.setDcontent(request.getParameter("dcontent"));
		dataService.dataUpdate(dto);
		return "redirect:list.do";
	}
} 
