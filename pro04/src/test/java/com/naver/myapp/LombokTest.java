package com.naver.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.naver.dto.SampleDTO;

import lombok.Lombok;

public class LombokTest {
	private static final Logger logger = LoggerFactory.getLogger(Lombok.class); 

	@Test
	public void testLombok() {
		SampleDTO dto = new SampleDTO();
		dto.setId("kkt");
		dto.setPw("1004");
		
		logger.info(dto.toString());
		//fail("Not yet implemented");
	}

}
