package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class SearchContactForm extends ActionForm {
private String fname;
private String lname;
private String email;
private String phone;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
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

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors=new ActionErrors();
        if(email==null||email.length()==0)
        {
      	  errors.add("email",new ActionError("errors.email.required"));
        }
        return errors;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.fname=null;
		this.lname=null;
		this.email=null;
		this.phone=null;
		}
}
