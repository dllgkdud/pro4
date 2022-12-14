package com.naver.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.naver.dto.DataDTO;

@Repository
public class DataDAOImpl implements DataDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<DataDTO> dataList() throws Exception {
		return sqlSession.selectList("data.dataList");
	}
	
	@Transactional
	@Override
	public DataDTO dataDetail(int dno) throws Exception {
		sqlSession.update("data.visited", dno);
		return sqlSession.selectOne("data.dataDetail", dno);
	}

	@Override
	public void dataInsert(DataDTO dto) throws Exception {
		sqlSession.insert("data.dataInsert", dto);
	}

	@Override
	public void dataDelete(int dno) throws Exception {
		sqlSession.delete("data.dataDelete",dno);
	}

	@Override
	public void dataUpdate(DataDTO dto) throws Exception {
		sqlSession.update("data.dataUpdate", dto);
	}
}
