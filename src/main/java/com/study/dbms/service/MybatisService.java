package com.study.dbms.service;

import java.util.List;

import com.study.dbms.dto.BoardDto;

public interface MybatisService {
	public List<BoardDto> getBoardList();
}
