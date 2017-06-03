package com.jlcindia.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="hello",urlPatterns={"/hello.jlc"})
public class HelloServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		//1.collect the Request parameters
		String nm=req.getParameter("name");
		String em=req.getParameter("email");
		String msg=req.getAttribute("MSG").toString();
		System.out.println("In HelloServlet");
		System.out.println(nm);
		System.out.println(em);
		System.out.println(msg);
		RequestDispatcher rd1=req.getRequestDispatcher("header.jlc");
		rd1.include(req, res);
		PrintWriter out=res.getWriter();
		out.println("<br/><br/>");
		out.println("<h1>"+msg+"</h1>");
		out.println("<h1>"+msg+"</h1>");
		out.println("<br/><br/>");
		RequestDispatcher rd2=req.getRequestDispatcher("footer.html");
		rd2.include(req, res);
}
}
