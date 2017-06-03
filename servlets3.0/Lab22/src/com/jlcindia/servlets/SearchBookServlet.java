package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import com.jlcindia.services.BookService;
import com.jlcindia.to.BookTo;

@WebServlet(name="search",urlPatterns={"/searchbooks.jlc"})
public class SearchBookServlet extends HttpServlet{
BookService bs=null;
public void init(ServletConfig sc){
	bs=new BookService();
}
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	//1.Collect the data
	HttpSession session=req.getSession();
	Object obj=session.getAttribute("BOOKS");
	if(obj!=null){
		session.removeAttribute("BOOKS");
	}
	String cat=req.getParameter("category");
	List<BookTo> books=bs.getBooksByCat(cat);
	if(books.size()>0){
		session.setAttribute("BOOKS", books);
	}else{
		String msg="No Books Available in Bookstore";
		req.setAttribute("MSG", msg);
	}
	RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
	rd.forward(req, res);
}
}
