package com.study.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.mybatis.data.dao.MybatisDao;
import com.study.mybatis.data.dto.MybatisDto;
import com.study.mybatis.service.MybatisService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MybatisServiceImpl implements MybatisService {
	@Autowired
	MybatisDao dao;

	@Override
	public String test() {
		return "test";
	}

	@Override
	public List<MybatisDto> getList() {
		log.info("service");
		List<MybatisDto> dto = dao.getList();
		return dto;
	}

}
