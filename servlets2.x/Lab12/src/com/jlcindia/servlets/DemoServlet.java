package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		//1.Collect the Request parameters
		String em=req.getParameter("email");
		System.out.println(em);
		HttpSession session=req.getSession();
		System.out.println(session.isNew());
		//System.out.println(session.getId());
		//System.out.println(session.getCreationTime());
		//System.out.println(session.getLastAccessedTime());
		String url1="home.jsp;JSESSIONID="+session.getId();
		System.out.println(url1);
		String url2=res.encodeURL("home.jsp");
		System.out.println(url2);
		
		RequestDispatcher rd=req.getRequestDispatcher(url2);
		rd.forward(req, res);
	}
}
