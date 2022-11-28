package com.naver.myapp;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.naver.myapp.HomeController;

public class JDBCConn {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
			logger.info("오라클 연결이 정상적으로 완료되었습니다.");
		} catch(Exception e) {
			fail("Not yet implemented");
		}		
	}
}
