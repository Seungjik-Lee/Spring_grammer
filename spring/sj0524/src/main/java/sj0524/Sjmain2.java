package sj0524;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Sjmain2 {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("appctx.xml");
		
		SjService ss = gxac.getBean(SjService.class);
		ss.doAABBCC();
	}
}