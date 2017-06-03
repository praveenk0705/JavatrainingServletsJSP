package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddToCartServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	//1.Collect the data
	String bn=req.getParameter("bname");
	HttpSession session=req.getSession();
	session.setAttribute(bn, bn);
	RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
	rd.forward(req, res);
}
}
