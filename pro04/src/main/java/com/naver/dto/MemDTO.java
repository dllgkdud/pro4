package com.naver.dto;

import lombok.Data;

@Data
public class MemDTO {
	private String userid;
    private String userpw;
    private String username;
    private String birth;
    private String email;
    private String tel;
    private String addr1;
    private String addr2;
    private String postcode;
    private int userpt;
    private int visited;
    private String regdate;
}
