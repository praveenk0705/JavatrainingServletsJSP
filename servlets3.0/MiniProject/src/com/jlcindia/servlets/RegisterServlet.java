package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import com.jlcindia.userservice.UserService;
import com.jlcindia.mail.MailService;
import com.jlcindia.to.UserTO;

@WebServlet(name="register",urlPatterns={"/register.jlc"})
public class RegisterServlet extends HttpServlet{
	UserService us=null;
	public void init(ServletConfig sc){
		us=new UserService();
	}
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		//1.collect the data
		String fn=req.getParameter("fname");
		String em=req.getParameter("email");
		String ph=req.getParameter("phone");
		String un=req.getParameter("username");
		String pw=req.getParameter("password");
		int uid=us.getNextUserId();
		long ph1=Long.parseLong(ph);
		UserTO uto=new UserTO(uid, fn, em, ph1, un, pw);
		int x=us.registerUser(uto);
		HttpSession session=req.getSession();		
		String result="";
		if(x==1){
			session.setAttribute("UN", un);
			result="home.jsp";
			String sub="Registration Success!";
			String body="<h1>Hi "+fn+" Your Registration has been completed successfully</h1>";
			MailService.sentMail(em, sub, body);
		}else{
			String msg="Registration Failed-Try Again";
			req.setAttribute("MSG", msg);
			result="register.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req, res);
	}
}
