package com.study.youtube.easyspub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/easyspub")
public class EasyspubController {
	
	String path = "/easyspub";
	
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

}
