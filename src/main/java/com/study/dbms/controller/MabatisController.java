package com.study.dbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.dbms.service.MybatisService;

@RestController
@RequestMapping("/dbms/mybatis")
public class MabatisController {
	@Autowired
	MybatisService mybatisService;
	
	public String getBoardList() {
		mybatisService.getBoardList();
		
		return "test";
	}

}
