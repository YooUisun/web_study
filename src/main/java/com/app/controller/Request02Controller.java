package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//localhost:8080/request02/url02 또는 url03 해줘야 접속 가능 

@Controller
@RequestMapping("/request02")
public class Request02Controller {
	
	@RequestMapping("/url02")
	public String url02() {

		return "url1";
	}

// @RequestMapping("/request02/url03") 이렇게 해도 된다.
	@RequestMapping("/url03")
	public String url03() {

		return "url1";
	}
}
