package sj_01;

public class MemberDTO {

	private String name;
	
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + "]";
	}

	public MemberDTO() {
	}
	
	public MemberDTO(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
