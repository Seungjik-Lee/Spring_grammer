package sj_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberController {
	
	MemberService memberService;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public MemberController(MemberService memberService) throws IOException {
		this.memberService = memberService;
		
		while(true) {
			System.out.println("?? ?ұ??");
			String cmd = br.readLine();
			if(cmd.contentEquals("insert")) {
				memberService.insert();
			}
		}
	}
 	
	public static void main(String[] args) throws IOException {
		
		
		
//		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfi.class);
//		MemberService ms = acac.getBean("ms", MemberService.class);
		
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("myconfi.xml");
		
		MemberService ms = gxac.getBean("memberService", MemberService.class);
		
		new MemberController(ms);
	}
}
