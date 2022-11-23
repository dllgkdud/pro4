package com.samsung.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samsung.dto.SampleDTO;

import lombok.Lombok;

public class LombokTest {
	private static final Logger logger = LoggerFactory.getLogger(Lombok.class); 

	@Test
	public void testLombok() {
		SampleDTO dto = new SampleDTO();
		dto.setName("ÀÌÇÏ¿µ");
		dto.setAge(25);
		dto.setIq(138.5);
		
		logger.info(dto.toString());
		//fail("Not yet implemented");
	}

}
