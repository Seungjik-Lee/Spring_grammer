package sj_0531.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import sj_0531.cls.A;
import sj_0531.myconf.Myconf1;

public class SjMain {
	
	public static void main(String[] args) {
		//스프링 컨테이너 생성
		AbstractApplicationContext aac = 
				new AnnotationConfigApplicationContext(Myconf1.class);
		
		A a = aac.getBean(A.class);
		a.doA();
		aac.close();
	}
}
