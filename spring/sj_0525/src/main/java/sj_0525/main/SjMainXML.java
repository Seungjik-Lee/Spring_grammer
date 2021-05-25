package sj_0525.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import sj_0525.beans.UseAABB;

public class SjMainXML {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("appctx.xml");
		
		UseAABB uab = gxac.getBean(UseAABB.class);
		uab.doAABB();
	}
}
