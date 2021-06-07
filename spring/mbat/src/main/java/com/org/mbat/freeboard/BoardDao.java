package com.org.mbat.freeboard;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {

	@Autowired
	SqlSessionTemplate sst;
	
	public void insert(Board board) {
		sst.insert("freeboard.insert",board);
	}
}
