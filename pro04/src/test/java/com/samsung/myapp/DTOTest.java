package com.samsung.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samsung.dto.MemberDTO;

public class DTOTest {
	private static final Logger logger = LoggerFactory.getLogger(DTOTest.class);
	
	@Test
	public void testDTO() {
		MemberDTO dto = new MemberDTO();
		dto.setId("lhy");
		dto.setPw("1234");
		dto.setName("���Ͽ�");
		dto.setTel("01012341234");
		dto.setAddr("�ϻ굿�� ���׵�");
		dto.setPt(100);
		dto.setRegdate("2022-11-23");
		
		logger.info(dto.toString());
		//fail("Not yet implemented");
	}

}
