package com.org.sjproject.freeboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired
	BoardDao dao;
	
	public void insert(Board board) {
		dao.insert(board);
	}
}
