package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import com.jlcindia.mail.MailService;
import com.jlcindia.to.UserTO;
import com.jlcindia.userservice.UserService;

@WebServlet(name="login",urlPatterns={"/login.jlc"})
public class LoginServlet extends HttpServlet{
	UserService us=null;
	public void init(ServletConfig sc){
		us=new UserService();
	}
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		//1.collect the data
		String un=req.getParameter("username");
		String pw=req.getParameter("password");
		int x=us.verifyUser(un, pw);
		HttpSession session=req.getSession();		
		String result="";
		if(x==1){
			session.setAttribute("UN", un);
			result="home.jsp";
		}else{
			String msg="Invalid Username or Password";
			req.setAttribute("MSG", msg);
			result="index.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req, res);
	}
}
