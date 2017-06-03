package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet{
public void init(ServletConfig sc) throws ServletException{
	System.out.println("DemoServlet-init()");
	String ci=sc.getInitParameter("City");
	System.out.println(ci);
}
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	System.out.println("DemoServlet-service()");
	String nm=req.getParameter("name");
	String em=req.getParameter("email");
	String ip=req.getRemoteAddr();
	String msg="<h1> Hello! "+nm+"<br>";
	msg=msg+"Your Email Id is"+em+"<br>";
	msg=msg+"You are sending the requesting from IP Address :"+ip;
	req.setAttribute("MSG", msg);
	PrintWriter out=res.getWriter();
	out.println(msg);
}
public void destroy(){
	System.out.println("DemoServlet-destroy()");
}
}
