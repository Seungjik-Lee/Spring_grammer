package sj_01;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

	List<MemberDTO> list = new ArrayList<MemberDTO>();
	
	public void doInsert() {
		MemberDTO memberDto = new MemberDTO("고길동");
		System.out.println("저장 했음");
	}
}
