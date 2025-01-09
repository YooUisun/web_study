package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//localhost:8080/url1 이렇게 접속 가능

@Controller
public class Request01Controller {

	//요청 주소별로 맵핑
	
	@RequestMapping("/url1")	//괄호안에 명시된 주소로 요청이 왔을 때 실행해라.
	public String url1() {
		
		return "url1"; //그 이름을 가지고 있는 view 파일을 명시
		
		// 	/WEB_INF/views/ return한view이름 .jsp
	}
	
	@RequestMapping("/url2")
	public String url2() {
		return "home";
	}
	
	@RequestMapping("/url3")		
	public String url3() {
		return "url1";		
	}
	
	@RequestMapping("/url4")		//GET 방식이랑 POST 방식 둘 다 수신을 한 것임.
	public String url4() {
		
		return "url/url4";
		//					/WEB-INF/views/ 			.jsp
		//										url1
		//		/WEB-INF/views/url/url4.jsp
		//						url/url4
	}
	
	// 주소창에다가 다이렉트로 입력하는건 GET 방식임 www.naver.com 처럼 
	
	//HTTP 통신 할 떄 Method = GET /POST / DELETE / PUT / PATCH 이러한 방식들이 있음
							//GET 이랑 POST만 보면 된다. 지금은
	@RequestMapping(value = "/url5", method = RequestMethod.GET)	//얘는  GET만 받는거임
	public String url5() {
		return "url/url4";
	}
	
	
	@RequestMapping(value = "/url6", method = RequestMethod.POST)	//얘는  POST만 받음
	public String url6() {
		return "url/url4";
	}
	
	@GetMapping("/url7")
	public String url7() {
		return "url/url4";
	}
	
	@PostMapping("/url8")
	public String url8() {
		return "url/url4";
	}
}
