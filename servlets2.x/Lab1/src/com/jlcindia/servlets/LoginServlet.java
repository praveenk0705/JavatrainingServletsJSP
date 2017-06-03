package com.jlcindia.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LoginServlet extends HttpServlet{
public void init(ServletConfig sc){
	System.out.println("init()-LoginServlet");
}
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	System.out.println("service()-LoginServlet");
	//1.collect the data
	String un=req.getParameter("username");
	String pw=req.getParameter("password");
	//2.Process the request
	String msg="";
	if(un.equals(pw)){
		msg="Hello "+un+" ! Your login is Successful.";
	}else{
		msg="Hello "+un+" ! Your login is Failed.";
	}
	//3.Send the Response
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<font size=6 color=red>"+msg+"</font>");
}
public void destroy(){
	System.out.println("destroy()-LoginServlet");
}
}
