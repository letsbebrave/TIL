package com.greedy.ncs.member.model.dto;

import java.util.Calendar;

public class MemberDTO {
	private String id;
	private int pw;
	private String name;
	private int date;
	private double height;
	private double weight;
	private boolean check;
	private int membernum;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public int getMembernum() {
		return membernum;
	}
	public void setMembernum(int membernum) {
		this.membernum = membernum;
	}
	public MemberDTO(String id, int pw, String name, int date, double height, double weight, boolean check,
			int membernum) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.date = date;
		this.height = height;
		this.weight = weight;
		this.check = check;
		this.membernum = membernum;
		
		System.out.println("아이디 : " + id + ", " + "비밀번호 : " + pw + ", " + "이름 : " + name + ", " + "가입일 : " +  date + ", " + "키 : " + height + ", " + "몸무게 : " + weight + ", " + "활성화유무 : " + check  + ", " +  "회원번호 : " + membernum);
	}
	
	
	
}
