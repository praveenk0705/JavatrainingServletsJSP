package com.jlcindia.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TestServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	//1.collect the Request parameters
	String nm=req.getParameter("name");
	String em=req.getParameter("email");
	String msg="Hi "+nm+" ! Your Email is "+em;
	System.out.println("In TestServlet");
	System.out.println(nm);
	System.out.println(em);
	System.out.println(msg);
	req.setAttribute("MSG", msg);
	PrintWriter out=res.getWriter();
	out.println("<h1> before Forward:I am From TestServlet</h1>");
	System.out.println("before Forward:I am From TestServlet");
	//out.flush();
	//out.close();
	RequestDispatcher rd=req.getRequestDispatcher("hello.jlc");
	rd.forward(req, res);
	//rd.forward(req, res);
	out.println("<h1> After Forward:I am From TestServlet</h1>");
	out.flush();
	out.close();
	System.out.println("After Forward:I am From TestServlet");
	}
}