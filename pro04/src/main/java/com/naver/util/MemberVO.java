package com.naver.util;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MemberVO {
	@Id			//primary key
	@Size(min=5, max=12, message="���̵�� 5~12�� ���ܷ� �ۼ�")
	String id;
	
	@Column
	@NotNull
	@Size(min=8, max=12, message="��й�ȣ�� 8~12�� ���ܷ� �ۼ�")
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
