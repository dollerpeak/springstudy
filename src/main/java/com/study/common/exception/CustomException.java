package com.study.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private Exception exception;
	private HttpStatus httpStatus;

	public CustomException() {
		super();
	}

	public int getHttpStatusCode() {
		return httpStatus.value();
	}

	public String getHttpStatusSeries() {
		return httpStatus.series().toString();
	}

	public String getHttpStatusType() {
		return httpStatus.getReasonPhrase();
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

}
