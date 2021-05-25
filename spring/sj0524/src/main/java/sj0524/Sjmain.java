package sj0524;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Controller
public class Sjmain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Appctx.class);
		
//		AA aa = acac.getBean(AA.class);
//		aa.doA();
//		aa.doAA();
//		
//		BB bb = acac.getBean(BB.class);
//		bb.doB();
//		bb.doBB();
		
		SjService ss = acac.getBean(SjService.class);
		ss.doAABBCC();
	}
}
