package com.org.mbat.freeboard;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
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
   
   @Autowired
   SqlSessionTemplate sst;
   
   
   @RequestMapping(value = "/freeboard", method = RequestMethod.GET)
   public String freeboard(Model model) {
      System.out.println("게시판홈");
      List list = sst.selectList("freeboard.select", 0);
//      System.out.println("======================");
//      System.out.println(list);
//      System.out.println("======================");

      model.addAttribute("list",list);
      
      
//      sst.select("freeboard.select",null);
      
//      bs.select();
//      model.addAttribute("data","mydata");
//      List strlist = Arrays.asList("a1","a2","a3","a4");
//      List mylist = Arrays.asList(new Board(1,"title","pass","content","wdate","email",null,null),new Board());
//      
//      model.addAttribute("strlist",strlist);
//      model.addAttribute("mylist",mylist);
      return "freeboard/freeboard";
   }
   
//   @RequestMapping(value = "/freeboard/insert")
//   public String freeboardinsert(Model model,HttpServletRequest request) {
//      String name = request.getParameter("name");
//      System.out.println("name ="+name);
////      bs.select();
////      bs.insert();
//      return "freeboard/freeboard";
//   }
   
   @RequestMapping(value = "/freeboard/insert")
   public String freeboardinsert(Model model,@RequestParam String name,Board board) {
      System.out.println("name ="+name);
      System.out.println(board);
//      bs.select();
      bs.insert(board);
      return "redirect:/freeboard";
   }
   
   @RequestMapping(value = "/freeboard/insertform", method = RequestMethod.GET)
   public String freeboardinsertform(Model model) {
      System.out.println("게시판글쓰기");
//      bs.select();
//      bs.insert();
      return "freeboard/freeboardinsert";
   }
   
}