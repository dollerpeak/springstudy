package com.study.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.mybatis.data.dto.MybatisDto;
import com.study.mybatis.service.MybatisService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/around/mybatis")
public class MybatisController {
	@Autowired
	MybatisService service;
	
	@GetMapping("/test")
	public String test() {
		return service.test();
	}
	
	@GetMapping("/getlist")
	public List<MybatisDto> getList() {
		log.info("controller");
		return service.getList();
	}
}
