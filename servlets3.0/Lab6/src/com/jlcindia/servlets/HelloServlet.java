package com.jlcindia.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebInitParam;

@WebServlet(name="hello",
			urlPatterns={"/hello.jlc","/hello1.jlc"},
			initParams={
				@WebInitParam(name="email",value="sri@jlc"),
				@WebInitParam(name="phone",value="998877")
				}
			)
public class HelloServlet extends HttpServlet{
	String em=null;
	String ph=null;
	String ci=null;
	String st=null;
	public void init(ServletConfig sconfig){
		System.out.println("init()");
		//1.Collect the config parameters
		em=sconfig.getInitParameter("email");
		ph=sconfig.getInitParameter("phone");
		//2.Collect the Context parameters
		ServletContext scontext=sconfig.getServletContext();
		ci=scontext.getInitParameter("city");
		st=scontext.getInitParameter("state");
	}

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		System.out.println("service()");
		//3.Collect the Request parameters
		String fn=req.getParameter("fname");
		String ln=req.getParameter("lname");
		//4.process
		System.out.println("First name: "+fn);
		System.out.println("Last name: "+ln);
		System.out.println("Email ID: "+em);
		System.out.println("Phone No: "+ph);
		System.out.println("City: "+ci);
		System.out.println("State: "+st);
		//5.send response
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>Java Learning Center</h1>");
		out.println("<h1>Ok Done</h1>");
	}
	public void destroy(){
		System.out.println("destroy()");
	}
}
