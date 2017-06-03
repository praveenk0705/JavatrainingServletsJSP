package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="hai",urlPatterns={"/hai.jlc"},loadOnStartup=1)
public class HaiServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	System.out.println("HaiServlet-service()");
	String nm=req.getParameter("name");
	String em=req.getParameter("email");
	System.out.println(nm);
	System.out.println(em);
	HttpSession session=req.getSession();
	System.out.println(session.getId());
	ServletConfig sconfig=getServletConfig();
	ServletContext scontext=sconfig.getServletContext();
	String cp1=scontext.getInitParameter("hello");
	String cp2=scontext.getInitParameter("hai");
	System.out.println(cp1);
	System.out.println(cp2);
	req.setAttribute("NM", nm);
	req.setAttribute("EM", em);
	RequestDispatcher rd=scontext.getRequestDispatcher("/hai.jsp");
	rd.forward(req, res);
}
}
