package com.naver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.naver.dao.SampleDAO;
import com.naver.dto.SampleDTO;

public class SampleServiceImpl implements SampleService {
	
	@Autowired
	SampleDAO sampleDao;

	@Override
	public List<SampleDTO> sampleList() throws Exception {
		return sampleDao.sampleList();
	}
}
