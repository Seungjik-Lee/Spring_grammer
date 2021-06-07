package sj_0607.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sj_0607.cls.CalC;
import sj_0607.conf.MyConf;

/*
 * 
 * MyConf ������ ��ü ��� �� ����� Ŭ����
 * Calc ���� Ŭ����
 * MyAscpect aop���� Ŭ����
 * main �Լ� �����ϴ� Ŭ����
 * requestMapping("/") -> url����
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
