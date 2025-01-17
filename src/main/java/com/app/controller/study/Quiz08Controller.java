package com.app.controller.study;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Quiz08Controller {
	
	@GetMapping("/quiz/session/login")
	public String login() {
		return "quiz/quiz08/login";
		
	}
	
	@PostMapping("/quiz/session/login")
	public String loginAction(HttpServletRequest request) {
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
		
		//id pw <-> 데이터 비교 -> 정상인지 체크

	    HttpSession session = request.getSession();
		
		//로그인 성공 이라고 간주!
//		session.setAttribute("isLogin", true);
	    session.setAttribute("loginId", id); // 로그인 ID 저장
	    session.setAttribute("count", 0);   // 초기 접속 횟수 저장

		
		// 로그인 후 -> 내가쓴 게시글
		//DB 조회
		return "redirect:/quiz/session/count";
		
	}
	
	@GetMapping("/quiz/session/count")
		public String count(HttpSession session, Model model) {
		
		
		//로그인 한 상태면 ? -> count 증가
		if(session.getAttribute("loginId") != null ) {
			//count 값 증가
			session.setAttribute("count",((Integer)session.getAttribute("count")) + 1);
	} else {
		model.addAttribute("count", 0);
		
	}
		//로그인 안 한 상태면? 접속한 사용자 없다~  count 0 ~
		
		return "quiz/quiz08/count";
			
	}
	
	@GetMapping("/quiz/session/logout")
	public String logout(HttpSession session) {
		
		//세션에 저장된 정보 삭제
		//이 2개는 login id 랑  count 만 삭제인데
		
//		session.removeAttribute("loginId");
//		session.removeAttribute("count");
		
		//얘는 싹다 초기화임
		session.invalidate();		
		
		return "redirect:/quiz/session/count";
	}
}
