package com.naver.service;

import java.util.List;

import com.naver.dto.SampleDTO;

public interface SampleService {
	List<SampleDTO> sampleList() throws Exception;
}
