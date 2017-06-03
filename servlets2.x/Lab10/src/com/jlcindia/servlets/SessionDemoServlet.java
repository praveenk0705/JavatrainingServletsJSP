package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionDemoServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		//1.Collect the Request parameters
		String nm=req.getParameter("name");
		String em=req.getParameter("email");
		HttpSession session=req.getSession();
		System.out.println(session.isNew());
		System.out.println(session.getId());
		System.out.println(session.getCreationTime());
		System.out.println(session.getLastAccessedTime());
		
		ServletConfig sconfig=getServletConfig();
		ServletContext scontext=sconfig.getServletContext();
		
		if(em!="")
		req.setAttribute("EM", em);
		if(em!="")
		session.setAttribute("EM", em);
		if(em!="")
		scontext.setAttribute("EM", em);
		
		RequestDispatcher rd=req.getRequestDispatcher("show.jsp");
		rd.forward(req, res);
	}
}
