package com.org.mbat;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	DataSource ds;
	
	@Autowired
	SqlSessionTemplate sst;
	
	//로그인 세션
	@RequestMapping("/aoplogin")
	@ResponseBody
	public String doA(HttpServletRequest request) {
		System.out.println("여기에서 aop 실행");
		HttpSession session= request.getSession();
		session.setAttribute("id", "1234");
		return "<div style='background:#ccc'>login session sucess<div>";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "index";
	}

}
