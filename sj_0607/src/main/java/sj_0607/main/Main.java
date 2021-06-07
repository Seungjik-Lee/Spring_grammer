package sj_0607.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sj_0607.cls.CalC;
import sj_0607.conf.MyConf;

/*
 * 
 * MyConf 스프링 객체 담는 통 만드는 클래스
 * Calc 계산기 클래스
 * MyAscpect aop생성 클래스
 * main 함수 실행하는 클래스
 * requestMapping("/") -> url매핑
 * home();
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConf.class);
		
		CalC cl = acac.getBean(CalC.class);
//		cl.doA();
		cl.doB(10, 20);
		
		acac.close();
	}
}
