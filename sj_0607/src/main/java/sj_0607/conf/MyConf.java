package sj_0607.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sj_0607.cls.CalC;
import sj_0607.cls.MyAspect;

@Configuration
@EnableAspectJAutoProxy
public class MyConf {

	@Bean
	public MyAspect myAspect() {
		MyAspect ma = new MyAspect();
		return ma;
	}
	
	@Bean
	public CalC calc() {
		CalC cl = new CalC();
		return cl;
	}
}
