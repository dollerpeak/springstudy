package com.study.front.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//	@GetMapping("index")
	@GetMapping("/")
	public String index() {
		//return "index";
		return "/home";
	}

	@GetMapping("/home")
	public String home() {
		return "/home";
	}
	
	@GetMapping("/testhtml")
	public String testHtml() {
		return "/testhtml";
	}
	
	@GetMapping("/testcss")
	public String testCss() {
		return "/testcss";
	}
	
	@GetMapping("/testjs")
	public String testJs() {
		return "/testjs";
	}
	
	@GetMapping("/testjquery")
	public String testJquery() {
		return "/testjquery";
	}
	
	@GetMapping("/testajax")
	public String testAjax() {
		return "/testajax";
	}

	@GetMapping("/testjsp")
	public String testJsp() {
		return "/testjsp";
	}
	
	@GetMapping("/testresponsive")
	public String testResponsive() {
		return "/testresponsive";
	}
	
	@GetMapping("/testweb")
	public String testWeb() {
		return "/testweb";
	}

	
}
