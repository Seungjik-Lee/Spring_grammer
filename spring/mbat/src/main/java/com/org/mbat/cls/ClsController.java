package com.org.mbat.cls;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClsController {

	@RequestMapping("/aop")
	public String doA(HttpServletRequest request) {
		System.out.println("여기에서 aop 실행");
		HttpSession session= request.getSession();
		session.setAttribute("id", "1234");
		return "aop/doA";
	}
}
