package com.jlc.struts2;
import org.apache.struts2.config.*;
import com.opensymphony.xwork2.ActionSupport;

@Results({
	@Result(name="success",value="/home.jsp"),
	@Result(name="failed", value="/login.jsp")
})

public class AnnotatedLogin extends ActionSupport{
	private String username;
	private String password;
	public String execute() throws Exception{
		String status="failed";
		if(getUsername().equals("srinivas")&&getPassword().equals("srinivas")){
			status="success";
		}else{
			addActionError("Username or Password is incorrect");
		}
     return status;
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
	
}
