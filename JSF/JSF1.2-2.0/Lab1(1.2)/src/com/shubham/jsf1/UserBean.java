package com.shubham.jsf1;

public class UserBean {
	private String username;
	private String password;
	private String errMsg;

	public String verifyUser() {
		String result = null;

		if (username.equals(password)) {
			result = "success";
		} else {
			result = "failed";
			errMsg = "Invalid Username or Password";
		}

		return result;
	}

	public String gotoLogin() {
		errMsg = "";
		username = "Priyanka";
		return "login";
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

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	
}
