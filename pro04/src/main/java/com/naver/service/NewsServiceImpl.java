package com.naver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.dao.NewsDAO;
import com.naver.dto.NewsDTO;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDAO newsDAO;
	
	@Override
	public List<NewsDTO> newsList() throws Exception {
		return newsDAO.newsList();
	}

	@Override
	public NewsDTO newsDetail(int nno) throws Exception {
		return newsDAO.newsDetail(nno);
	}

	@Override
	public void newsInsert(NewsDTO dto) throws Exception {
		newsDAO.newsInsert(dto);
	}

	@Override
	public void newsDelete(int nno) throws Exception {
		newsDAO.newsDelete(nno);
	}

	@Override
	public void newsUpdate(NewsDTO dto) throws Exception {
		newsDAO.newsUpdate(dto);
	}
}
