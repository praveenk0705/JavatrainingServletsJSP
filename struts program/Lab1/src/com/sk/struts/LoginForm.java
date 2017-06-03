package com.sk.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;
import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{
private String username;
private String  password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
/*
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors=new ActionErrors();
		if(username==null || username.length()==0){
			errors.add("username",new ActionError("error.username.required"));
		}
		if(username==null || username.length()==0){
			errors.add("username",new ActionError("error.password.required"));
		}
				return errors;

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	this.username=null;
	this.password=null;
	
	}
*/
}
