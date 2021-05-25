package sj_0525.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sj_0525.beans.AA;
import sj_0525.beans.BB;
import sj_0525.conf.Appctx;

public class SjMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Appctx.class);
		
		AA aa = acac.getBean(AA.class);
		AA aa1 = acac.getBean(AA.class);
		AA aa2 = acac.getBean(AA.class);
		BB bb = acac.getBean(BB.class);
		BB bb1 = acac.getBean(BB.class);
		BB bb2 = acac.getBean(BB.class);
		aa.doA();
		aa.doAA();
		bb.doB();
		bb.doBB();
		
		System.out.println(aa1);
		System.out.println("aa1.a = " + aa1.a);
		System.out.println(aa2);
		System.out.println(bb1);
		System.out.println(bb2);
	}
}
