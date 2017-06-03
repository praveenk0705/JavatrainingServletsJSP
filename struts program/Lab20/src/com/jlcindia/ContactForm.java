package com.jlcindia;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;

public class ContactForm extends ActionForm {
 String sname;
 String email;
 String phone;
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
