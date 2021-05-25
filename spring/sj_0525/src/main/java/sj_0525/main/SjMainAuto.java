package sj_0525.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sj_0525.beans.UseAABB;
import sj_0525.conf.Appctx;

public class SjMainAuto {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Appctx.class);
		
		UseAABB uab = acac.getBean(UseAABB.class);
		uab.doAABB();
	}
}
