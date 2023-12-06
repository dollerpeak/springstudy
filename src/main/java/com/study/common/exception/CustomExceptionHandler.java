package com.study.common.exception;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

public class CustomExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public ResponseEntity<Map<String, String>> CustomExceptionHandler(Exception e){
		return null;
		
	}

}
