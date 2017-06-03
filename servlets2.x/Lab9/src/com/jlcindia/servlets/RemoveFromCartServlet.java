package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RemoveFromCartServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		//1.Collect the data
		String bn=req.getParameter("bname");
		HttpSession session=req.getSession();
		session.removeAttribute(bn);
		RequestDispatcher rd=req.getRequestDispatcher("showcart.jlc");
		rd.forward(req, res);
	}
}
