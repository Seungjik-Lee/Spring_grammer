package com.org.sjproject.cls;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClsController {

	// 세션 로그인
	@RequestMapping("/aopchk")
	@ResponseBody
	public String sessionchk(HttpServletRequest request) {
		System.out.println("여기에서 aop 실행");
		return "after session check";
	}
	
	// 세션 로그인 
	@RequestMapping("/aopdoa")
	public String doa(HttpServletRequest request) {
		System.out.println("여기에서 aop 실행");
		return "aop/doa";
	}
}
