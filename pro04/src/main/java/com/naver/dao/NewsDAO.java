package com.naver.dao;

import java.util.List;

import com.naver.dto.NewsDTO;

public interface NewsDAO {
	public List<NewsDTO> newsList() throws Exception;
	public NewsDTO newsDetail(int nno) throws Exception;
	public void newsInsert(NewsDTO dto) throws Exception;
	public void newsDelete(int nno) throws Exception;
	public void newsUpdate(NewsDTO dto) throws Exception;

}
