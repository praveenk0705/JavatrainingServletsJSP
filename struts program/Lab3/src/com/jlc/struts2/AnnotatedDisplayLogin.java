package com.jlc.struts2;

import org.apache.struts2.config.Result;

import com.opensymphony.xwork2.ActionSupport;

@Result(value="/login.jsp")

public class AnnotatedDisplayLogin extends ActionSupport {
	// default execute() return the String "SUCCESS"

}

