package sj_01;

import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfi {

	@Bean
	public MemberDao memberDao() {
		MemberDao md = new MemberDao();
		return md;
	}
	
	@Bean
	public MemberService memberService() {
		MemberService ms = new MemberService();
		ms.setMemberDao(memberDao());
		return ms;
	}
	
//	@Bean
//	public MemberController memberController() throws IOException {
//		return new MemberController(memberService());
//	}
}
