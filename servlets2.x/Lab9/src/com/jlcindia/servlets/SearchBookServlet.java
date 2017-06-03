package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SearchBookServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	String cat=req.getParameter("category");
	if(cat.equals("Java")){
		List<String> books=new ArrayList<String>();
		books.add("Learn Java");
		books.add("Learn JDBC");
		books.add("Master EJB");
		books.add("Master Spring");
		books.add("JSF Red Black");
		books.add("Hibernate Red Black");
		books.add("Master Android");
		HttpSession session=req.getSession();
		session.setAttribute("BOOKS", books);
	}else{
		String msg="No Books Available in Bookstore";
		req.setAttribute("MSG", msg);
	}
	RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
	rd.forward(req, res);
}
}
