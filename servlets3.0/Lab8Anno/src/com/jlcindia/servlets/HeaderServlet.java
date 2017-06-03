package com.jlcindia.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="header",urlPatterns={"/header.jlc"})
public class HeaderServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		System.out.println("In HeaderServlet");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("<h1>Java Learning Center</h1>");
		out.println("<h1>Welcomes you</h1>");
		out.println("</body></html>");
}
}
