package com.org.mbat.freeboard;

public class Board {

	private int idx;
	private String title;
	private String pass;
	private String content;
	private String wdate;
	private String name;
	private String email;
	private String see;
	
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", title=" + title + ", pass=" + pass + ", content=" + content + ", wdate=" + wdate
				+ ", name=" + name + ", email=" + email + ", see=" + see + "]";
	}

	public Board() {}
	
	public Board(int idx, String title, String pass, String content, String wdate, String name, String email,
			String see) {
		super();
		this.idx = idx;
		this.title = title;
		this.pass = pass;
		this.content = content;
		this.wdate = wdate;
		this.name = name;
		this.email = email;
		this.see = see;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSee() {
		return see;
	}
	public void setSee(String see) {
		this.see = see;
	}
	
	
}
