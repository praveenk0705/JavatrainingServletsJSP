package com.sk.struts;

public class StudentTO {
private String sid;
private String bid;
private String name;
private String email;
private String phone;
public StudentTO(String sid, String bid, String name, String email, String phone) {
	super();
	this.sid = sid;
	this.bid = bid;
	this.name = name;
	this.email = email;
	this.phone = phone;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getBid() {
	return bid;
}
public void setBid(String bid) {
	this.bid = bid;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}


}
