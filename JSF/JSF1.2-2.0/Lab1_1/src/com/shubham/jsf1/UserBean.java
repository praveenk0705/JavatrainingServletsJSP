package com.shubham.jsf1;

public class UserBean {
	private String errMsg;
	private String username;
	private String password;
	static {
		System.out.println("-----UserBean S.B.------");
	}

	public UserBean() {
		System.out.println("======UserBean() 0-args=====");
	}

	public String verifyUser() {
		System.out.println("\n*****verifyUser() Started*****");
		String result = null;

		if (username.equals(password)) {
			result = "success";
		} else {
			result = "failed";
			errMsg = "Invalid Username or Password";
			System.out.println(result);
		}
		System.out.println("*****verifyUser() Completed*****");

		return result;
	}

	public String gotoLogin() {
		System.out.println("\n*****gotoLogin() Started******");
		errMsg = "";
		System.out.println("*****gotoLogin() Completed******");
		return "login";
	}

	public String getErrMsg() {
		System.out.println("\ngetErrMsg()");
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		System.out.println("\nsetErrmsg()");
		this.errMsg = errMsg;
	}

	public String getUsername() {
		System.out.println("getUsername()");
		return username;
	}

	public void setUsername(String username) {
		System.out.println("setUsername()");
		this.username = username;
	}

	public String getPassword() {
		System.out.println("getPassword()");
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setPassword()");
		this.password = password;
	}

}
