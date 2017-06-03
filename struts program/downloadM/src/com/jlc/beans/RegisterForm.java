package com.jlc.beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

@SuppressWarnings("serial")
public class RegisterForm extends ActionForm {
	private String name;
	private String username;
	private String password;
	private String role;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.username=null;
		this.password=null;
		this.role=null;
		this.name=null;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors=new ActionErrors();
		if(name==null || name.length()==0){
			errors.add("name",new ActionError("name.required"));
		}
		if(username==null || username.length()==0){
			errors.add("username",new ActionError("username.required"));
		}
		if(password==null || password.length()==0){
			errors.add("password",new ActionError("password.required"));
		}
		if(role==null || role.length()==0){
			errors.add("role",new ActionError("role.required"));
		}
		return errors;
	}
	
	
}
