package com.naver.dto;

public class MemberDTO {
	private String userid;
    private String userpw;
    private String username;
    private String birth;
    private String email;
    private String tel;
    private String addr1;
    private String addr2;
    private String postcode;
    private int userpt;
    private int visited;
    private String regdate;
    
    
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public int getUserpt() {
		return userpt;
	}
	public void setUserpt(int userpt) {
		this.userpt = userpt;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", birth=" + birth + ", email=" + email 
				+ ", tel=" + tel + ", addr1=" + addr1 + ", addr2=" + addr2 + ", postcode=" + postcode + ", userpt=" + userpt
				+ ", visited=" + visited + ", regdate=" + regdate + "]";
	}
}
