package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuizController {

	@RequestMapping("/quiz/main")
    public String main() {
        return "quiz/main";
    }

	@RequestMapping(value="/quiz/product/mouse", method = RequestMethod.GET)
    public String mouse() {
        return "quiz/mouse";
    }

	@RequestMapping("/quiz/product/keyboard")
    public String keyboard() {
        return "quiz/keyboard";
    }
}
