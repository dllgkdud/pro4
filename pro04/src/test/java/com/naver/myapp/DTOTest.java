package com.naver.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.naver.dto.MemberDTO;

public class DTOTest {
	private static final Logger logger = LoggerFactory.getLogger(DTOTest.class);
	
	@Test
	public void testDTO() {
		MemberDTO dto = new MemberDTO();
		dto.setUserid("lhy");
		dto.setUserpw("1234");
		dto.setUsername("이하영");
		dto.setTel("01012341234");
		dto.setAddr1("일산동구 장항동");
		dto.setUserpt(100);
		dto.setRegdate("2022-11-23");
		
		logger.info(dto.toString());
		//fail("Not yet implemented");
	}

}
