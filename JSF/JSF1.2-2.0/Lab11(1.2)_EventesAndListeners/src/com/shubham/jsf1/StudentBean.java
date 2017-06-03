package com.shubham.jsf1;

import javax.faces.event.*;

public class StudentBean {
	private boolean showMyGrid1 = true;
	private boolean showMyGrid2 = false;
	private boolean showMyGrid3 = false;

	private String bid;
	private String sid;
	private String sname;
	private String email;
	private String phone;

	public StudentBean() {
		System.out.println("\n======StudentBean 0-args=======");
	}

	public void registerPart1(ActionEvent ae) {
		System.out
				.println("\n********registerPart1(ActionEvent) Started********");
		showMyGrid1 = false;
		showMyGrid2 = true;
		System.out.println("ActionEvent :" + ae.getComponent());
		System.out
				.println("********registerPart1(ActionEvent) Completed********");
	}

	public void registerPart2(ValueChangeEvent ve) {
		System.out
				.println("\n********registerPart2(ValueChangeEvent) Started********");
		showMyGrid2 = false;
		showMyGrid3 = true;
		System.out.println("ValueChangeEvent :" + ve.getComponent());
		System.out
				.println("********registerPart2(ValueChangeEvent) Completed********");
	}

	public String registerNow() {
		System.out.println("\n********registerNow() Started*******");
		System.out.println("Bid :" + bid);
		System.out.println("Sid :" + sid);
		System.out.println("Sname :" + sname);
		System.out.println("Email :" + email);
		System.out.println("Phone :" + phone);
		System.out.println("********registerNow() Completed*******");
		return "regstatus";
	}

	public boolean isShowMyGrid1() {
		System.out.println("getter isShowMyGrid1() :" + showMyGrid1);
		return showMyGrid1;
	}

	public void setShowMyGrid1(boolean showMyGrid1) {
		this.showMyGrid1 = showMyGrid1;
		System.out.println("setter setShowMyGrid1() :" + showMyGrid1);
	}

	public boolean isShowMyGrid2() {
		System.out.println("getter isShowMyGrid2() :" + showMyGrid2);
		return showMyGrid2;
	}

	public void setShowMyGrid2(boolean showMyGrid2) {
		this.showMyGrid2 = showMyGrid2;
		System.out.println("setter setShowMyGrid2() :" + showMyGrid2);
	}

	public boolean isShowMyGrid3() {
		System.out.println("getter isShowMyGrid3() :" + showMyGrid3);
		return showMyGrid3;
	}

	public void setShowMyGrid3(boolean showMyGrid3) {
		this.showMyGrid3 = showMyGrid3;
		System.out.println("setter setShowMyGrid3() :" + showMyGrid3);
	}

	public String getBid() {
		System.out.println("\ngetBid() :" + bid);
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		System.out.println("\nsetbid() :" + bid);
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}