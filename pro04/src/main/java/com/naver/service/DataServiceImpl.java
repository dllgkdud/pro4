package com.naver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.dao.DataDAO;
import com.naver.dto.DataDTO;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private DataDAO dataDAO;
	
	@Override
	public List<DataDTO> dataList() throws Exception {
		return dataDAO.dataList();
	}

	@Override
	public DataDTO dataDetail(int dno) throws Exception {
		return dataDAO.dataDetail(dno);
	}

	@Override
	public void dataInsert(DataDTO dto) throws Exception {
		dataDAO.dataInsert(dto);
	}

	@Override
	public void dataDelete(int dno) throws Exception {
		dataDAO.dataDelete(dno);
	}

	@Override
	public void dataUpdate(DataDTO dto) throws Exception {
		dataDAO.dataUpdate(dto);
	}
}
