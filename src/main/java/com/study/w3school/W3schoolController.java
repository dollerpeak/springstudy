package com.study.w3school;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/w3school")
public class W3schoolController {
	
	String path = "/w3school";

	@GetMapping("/main")
	public String index() {
		return path + "/main";
	}
	
	@GetMapping("/testhtml")
	public String testHtml() {
		return path + "/testhtml";
	}
	
	@GetMapping("/testcss")
	public String testCss() {
		return path + "/testcss";
	}
	
	@GetMapping("/testjs")
	public String testJs() {
		return path + "/testjs";
	}
	
	@GetMapping("/testjquery")
	public String testJquery() {
		return path + "/testjquery";
	}
	
	@GetMapping("/testajax")
	public String testAjax() {
		return path + "/testajax";
	}

	@GetMapping("/testjsp")
	public String testJsp() {
		return path + "/testjsp";
	}
	
	@GetMapping("/testresponsive")
	public String testResponsive() {
		return path + "/testresponsive";
	}
	
	@GetMapping("/testweb")
	public String testWeb() {
		return path + "/testweb";
	}
	
}
