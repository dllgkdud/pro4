package com.naver.dao;

import java.util.List;

import com.naver.dto.SampleDTO;

public interface SampleDAO {
	List<SampleDTO> sampleList() throws Exception;
}
