package sj_0531.myconf;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sj_0531.cls.A;
import sj_0531.cls.B;

@Configuration
public class Myconf1 {
	
	@Bean
	public A a() {
		A a = new A();
		return a;
	}
	
	@Bean(initMethod="init",destroyMethod="des")
	public B b() {
		B b = new B();
		return b;
	}
}