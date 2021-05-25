package sj_0525.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseAABB {
	
	@Autowired
	AA aa;
	
	@Autowired
	BB bb;
	
	public void doAABB() {
		aa.doA();
		aa.doAA();
		bb.doB();
		bb.doBB();
	}
}
