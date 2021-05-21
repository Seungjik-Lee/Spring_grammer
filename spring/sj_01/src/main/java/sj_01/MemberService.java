package sj_01;

public class MemberService {

	MemberDao memberDao;
	
	public MemberDao getMemberDao() {
		return memberDao;
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void insert() {
		memberDao.doInsert();
	}
	
	public MemberService() {
		
	}
}
