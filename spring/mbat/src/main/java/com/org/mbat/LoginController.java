package com.org.mbat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.org.mbat.freeboard.Board;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		return "register";
	}
	
	@RequestMapping("/aa")
	@ResponseBody
	// 변수 bbb에는 자동으로 할당
		public String aa(HttpServletRequest request,
							   String bbb,
							   String ccc,
							   String ddd) {
//			String ccc = request.getParameter("bbb");
//			System.out.println("ccc="+ccc);
			System.out.println("bbb = "+ bbb);
			System.out.println("ccc = "+ ccc);
			System.out.println("ddd = "+ ddd);
			return "aaa request...";
		}
		
		@RequestMapping("/bb")
		@ResponseBody
		// 변수 bbb에는 자동으로 할당
		public String bb(HttpServletRequest request,
							   String bbb,
							   String ccc,
							   String ddd) {
			String aaa = "{ 'bbb' : "+bbb+","
						+ " 'ccc' : "+ccc+","
						+ " 'ddd' : "+ddd+"}";
			return aaa;
		}
		
		@RequestMapping("/cc")
		@ResponseBody
		// 변수 bbb에는 자동으로 할당
		public String cc(HttpServletRequest request) {
			
			Board ba = new Board();
			ba.setEmail("dron512@naver.com");
			ba.setName("aaa");
			
			GsonBuilder builder = new GsonBuilder();
	        builder.setPrettyPrinting();
	        Gson gson = builder.create();
	        
			String str= gson.toJson(ba);
			return str;
		}
}
