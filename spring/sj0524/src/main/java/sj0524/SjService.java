package sj0524;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class SjService {

	@Autowired
	@Qualifier("aa")
	AA aa;
	
	@Autowired
	BB bb;
	
	@Autowired
	@Qualifier("cc1")
	CC cc;
	
	//������ �����̳� �ȿ� dd�� ������ ������ ����������
	@Autowired(required = false)
	DD dd;
	
	public void doAABBCC() {
		aa.doA();
		aa.doAA();
		bb.doB();
		bb.doBB();
		cc.doC();
		cc.doCC();
		dd.doD();
		dd.doDD();
	}
	
	@Bean
	public SjService sjservice() {
		SjService ss = new SjService();
		return ss;
	}
}
