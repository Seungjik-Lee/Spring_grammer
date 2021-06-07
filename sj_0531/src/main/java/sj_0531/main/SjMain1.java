package sj_0531.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import sj_0531.cls.A;

public class SjMain1 {
	
	public static void main(String[] args) {
		AbstractApplicationContext aac = new GenericXmlApplicationContext("Myconf1.xml");
		
		A a = aac.getBean(A.class);
		a.doA();
		aac.close();
	}
}
