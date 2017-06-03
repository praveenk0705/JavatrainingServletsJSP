package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowCartServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		HttpSession session=req.getSession();
		Enumeration<String> e=session.getAttributeNames();
		List<String> list=Collections.list(e);
		list.remove("BOOKS");
		req.setAttribute("CART", list);
		RequestDispatcher rd=req.getRequestDispatcher("showcart.jsp");
		rd.forward(req, res);
	}
}
