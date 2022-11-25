package com.naver.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private int seq;
    private String title;
    private String content; 
    private String nick;
    private String regdate;
    private int visited;
}
