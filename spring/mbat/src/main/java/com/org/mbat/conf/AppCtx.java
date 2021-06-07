package com.org.mbat.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.org.mbat.aop.MbatAspect;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {

	@Bean
	public MbatAspect mbatAspect() {
		MbatAspect ma = new MbatAspect();
		return ma;
	}
}
