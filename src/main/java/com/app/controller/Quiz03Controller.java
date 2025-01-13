package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz03")
public class Quiz03Controller {

    @RequestMapping("/pathA")
    public String pathA(Model model) {
        model.addAttribute("title", "퀴즈 페이지 A");
        model.addAttribute("productInfo", "상품 A에 대한 정보입니다.");
        return "quiz/Quiz03/display"; 
    }

    @RequestMapping("/pathB")
    public String pathB(Model model) {
        model.addAttribute("title", "퀴즈 페이지 B");
        model.addAttribute("productInfo", "상품 B에 대한 정보입니다.");
        return "quiz/Quiz03/display"; 
    }

    @RequestMapping("/pathCommon/A")
    public String pathCommonA(Model model) {
        model.addAttribute("title", "퀴즈 페이지 A 상품정보 표시");
        model.addAttribute("productInfo", "퀴즈 페이지 A 상품정보 표시.");
        return "quiz/Quiz03/display"; 
    }

    @RequestMapping("/pathCommon/B")
    public String pathCommonB(Model model) {
        model.addAttribute("title", "퀴즈 페이지 B 상품정보 표시");
        model.addAttribute("productInfo", "퀴즈 페이지 B 상품정보 표시.");
        return "quiz/Quiz03/display";
    }
}
