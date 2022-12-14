package com.naver.service;

import java.util.List;

import com.naver.dto.DataDTO;

public interface DataService {
	public List<DataDTO> dataList() throws Exception;
	public DataDTO dataDetail(int dno) throws Exception;
	public void dataInsert(DataDTO dto) throws Exception;
	public void dataDelete(int dno) throws Exception;
	public void dataUpdate(DataDTO dto) throws Exception;

}
