package com.study.web.easyspub;

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
	
	@GetMapping("/html")
	public String testHtml() {
		return path + "/html";
	}
	
	@GetMapping("/css")
	public String testCss() {
		return path + "/css";
	}

}
