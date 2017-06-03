package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BookDetailsServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	//1.Collect the data
	String bn=req.getParameter("bname");
	req.setAttribute("BN", bn);
	req.setAttribute("AU", "Srinivas");
	req.setAttribute("PUB", "JLC");
	req.setAttribute("COST", "999.99");
	RequestDispatcher rd=req.getRequestDispatcher("viewdetails.jsp");
	rd.forward(req, res);
}
}
