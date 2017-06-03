package com.jlcindia.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name="addenq",urlPatterns={"/addenquiry.jlc","/addenq.jlc"})
public class AddEnquiryServlet extends HttpServlet{
public void init(ServletConfig sconfig){
	System.out.println("init()");
}
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	System.out.println("service()");
	//1.collect the data
	String fn=req.getParameter("fname");
	String em=req.getParameter("email");
	String ph=req.getParameter("phone");
	String ge=req.getParameter("gender");
	String ti=req.getParameter("timings");
	String co=req.getParameter("course");
	String cous[]=req.getParameterValues("course");
	String re=req.getParameter("remarks");
	//2.Process the request
	//store in db
	String msg="Your Enquiry Has been added successfully";
	System.out.println("Full name: "+fn);
	System.out.println("Email ID: "+em);
	System.out.println("Phone No: "+ph);
	System.out.println("Gender: "+ge);
	System.out.println("Timings: "+ti);
	System.out.println("Course: "+co);
	System.out.println("All Courses ");
	for(String c:cous){
		System.out.println(c);
	}
	System.out.println("Remarks: "+re);
	
	//3.Send the Response
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	//out.println("<font size=6 color=red>"+msg+"</font>");
	out.println("<h1>Java Learning Center</h1>");
	out.println("<h1>"+msg+"</h1>");
	out.println("<h1>Full name: "+fn);
	out.println("<h1>Email ID: "+em);
	out.println("<h1>Phone No: "+ph);
	out.println("<h1>Gender: "+ge);
	out.println("<h1>Timings: "+ti);
	out.println("<h1>Course: "+co);
	out.println("<h1>All Course");
	for(String c:cous){
		out.println(c);
	}
	out.println("<h1>Remarks: "+re);
}
public void destroy(){
	System.out.println("destroy()");
}
}
