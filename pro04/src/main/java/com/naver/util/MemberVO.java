package com.naver.util;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MemberVO {
	@Id			//primary key인 필드에 지정
	@Size(min=5, max=12, message="아이디는 5~12자 내외로 작성")
	String id;
	
	@Column
	@NotNull
	@Size(min=8, max=12, message="비밀번호는 8~12자 내외로 작성")
	@Pattern(regexp="(^[A-Za-z0-9] {8,12}$)")	//(^?=.*[A-Za-z])(?=.*[0,9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,12}$)
	String pw;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
