package com.org.mbat.freeboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

	@Autowired
	BoardService bs;

	@Autowired
	SqlSessionTemplate sst;

	@RequestMapping(value = "/freeboard", method = RequestMethod.GET)
	public String freeboard(Model model) {
		System.out.println("게시판홈");
//		System.out.println(aa.getA());
		List list = sst.selectList("freeboard.select", 10);
		model.addAttribute("list", list);

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
	public String freeboardinsert(Model model, @RequestParam String name, Board board) {
		System.out.println("name =" + name);
		System.out.println(board);
//		bs.select();
		bs.insert(board);
		return "redirect:/freeboard";
	}

	@RequestMapping(value = "/freeboard/view")
	public String freeboardview(Model model, int idx) {
		System.out.println("idx = " + idx);
		Board board = sst.selectOne("freeboard.selectone",idx);
		model.addAttribute("board",board);
		return "freeboard/freeboardview";
	}

	@RequestMapping(value = "/freeboard/insertform", method = RequestMethod.GET)
	public String freeboardinsertform(Model model) {
		System.out.println("게시판글쓰기");
		return "freeboard/freeboardinsert";
	}
	
	@RequestMapping(value = "/freeboard/updateform", method = RequestMethod.GET)
	public String freeboardupdateform(Model model,int idx) {
		System.out.println("idx = " + idx);
		Board board = sst.selectOne("freeboard.selectone",idx);
		model.addAttribute("board",board);
		return "freeboard/freeboardupdate";
	}
	
	@RequestMapping(value = "/freeboard/update", method = RequestMethod.POST)
	public String freeboardupdate(Model model, Board board) {
		sst.update("freeboard.updateone",board);
		return "redirect:/freeboard";
	}

	@RequestMapping(value = "/freeboard/delete", method = RequestMethod.POST)
//	@ResponseBody
	public String freeboarddelete(Model model, String[] cks) {
		ArrayList<String> cklist = new ArrayList<String>(Arrays.asList(cks));
		if (cks != null) 
			sst.delete("freeboard.delete",cklist);
//		new BoardValidater().validate(board, errors);
//		if (errors.hasErrors()) {
//			return "freeboard/freeboardupdate";
//		}
//		sst.update("freeboard.updateone", board);
		return "redirect:/freeboard";
	}
}
