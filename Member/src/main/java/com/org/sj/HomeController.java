package com.org.sj;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	SqlSessionTemplate sst;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		sst.insert("member.insert");
		return "home";
	}
	
}
