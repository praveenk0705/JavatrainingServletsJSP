package com.wrox;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;

public class EmployeeForm extends ActionForm {
	protected String username;
	protected String password;
	protected String name;
	protected String phone;
	protected String email;
	protected String depid;
	protected String roleid;
	private ArrayList employees;
	
	public ArrayList getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList employees) {
		this.employees = employees;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepid() {
		return depid;
	}
	public void setDepid(String depid) {
		this.depid = depid;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
public void reset(ActionMapping mapping,HttpServletRequest request)
{
	this.username="";
	this.password="";
	this.name="";
	this.phone="";
	this.email="";
	this.depid="";
	this.roleid="";
}
public ActionErrors validate(ActionMapping mapping,HttpServletRequest request)
{
	org.apache.struts.action.ActionErrors errors=new ActionErrors();
	if((roleid==null)||(roleid.length()==0))
	{
		errors.add("roleid",new ActionError("errors.roleid.required"));
	}
	if((depid==null)||(depid.length()==0))
	{
		errors.add("depid",new ActionError("errors.depid.required"));
	}
	if((email==null)||(email.length()==0))
	{
		errors.add("email",new ActionError("errors.email.required"));
	}
	if((phone==null)||(phone.length()==0))
	{
		errors.add("phone",new ActionError("errors.phone.required"));
	}
	if((name==null)||(name.length()==0))
	{
		errors.add("name",new ActionError("errors.name.required"));
	}
	if((password==null)||(password.length()==0))
	{
		errors.add("password",new ActionError("errors.password.required"));
	}
	if((username==null)||(username.length()==0))
	{
		errors.add("username",new ActionError("errors.username.required"));
	}
	return errors;
	
}
}
