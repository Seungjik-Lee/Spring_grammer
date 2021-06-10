package com.org.mbat.cls;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClsController {

	//���� �α���
	@RequestMapping("/aopchk")
	@ResponseBody
	public String sessionchk(HttpServletRequest request) {
		System.out.println("���⿡�� aop ����");
		return "after session check";
	}
	
	// ���� �α��� 
	@RequestMapping("/aopdoa")
	public String doa(HttpServletRequest request) {
		System.out.println("���⿡�� aop ����");
		return "aop/doa";
	}
}
