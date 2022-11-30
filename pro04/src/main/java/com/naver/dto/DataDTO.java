package com.naver.dto;

import lombok.Data;

@Data
public class DataDTO {
	private int dno;
	private String dtitle;
	private String dcontent;
	private String dposter;
	private String dfile;
	private String dview;
	private String author;
    private int visited;
	private String regdate;
}
