package com.org.mbat.freeboard;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

	/*
	 * spring 객체 담는 통안에 넣는 어노테이션
	 * @component -> 필요한객체타입
	 * 
	 * @controller -> url 요청 들어오는곳에
	 * @service -> 게시판기능 서비스들...
	 * @repository -> db 관리
	 * 
	 * @aspect -> aop
	 * 
	 */
	
	@Autowired
	BoardService bs;
	
	@RequestMapping(value = "/freeboard", method = RequestMethod.GET)
	public String freeboard(Model model) {
		System.out.println("게시판홈");
//		bs.select();
		return "freeboard/freeboard";
	}
	
//	@RequestMapping(value = "/freeboard/insert")
//	public String freeboardinsert(Model model,HttpServletRequest request) {
//		String name = request.getParameter("name");
//		System.out.println("name ="+name);
////		bs.select();
////		bs.insert();
//		return "freeboard/freeboard";
//	}
	
	@RequestMapping(value = "/freeboard/insert")
	public String freeboardinsert(Model model,@RequestParam String name,Board board) {
		System.out.println("name ="+name);
		System.out.println(board);
//		bs.select();
		bs.insert(board);
		return "freeboard/freeboard";
	}
	
	@RequestMapping(value = "/freeboard/insertform", method = RequestMethod.GET)
	public String freeboardinsertform(Model model) {
		System.out.println("게시판글쓰기");
//		bs.select();
//		bs.insert();
		return "freeboard/freeboardinsert";
	}
	
}
