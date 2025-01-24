package com.app.controller.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.CommonCode;
import com.app.dto.user.User;

@Controller
public class RestQuizController {

	@GetMapping("/rest/quiz1")
	public String quiz1() {
		return "rest/quiz1";
	}

	@ResponseBody
	@GetMapping("/rest/quiz2")
	public String quiz2() {
		return "retrun text quiz2";
	}

	@ResponseBody
	@GetMapping("/rest/quiz3")	
	public User quiz3() {	
			User user = new User();
			user.setId("quizid");
			user.setPw("secret");
			user.setName("quiz이름");
			user.setUserType(CommonCode.USER_USERTYPE_CUSTOMER);
			
			return user;
		}
}
