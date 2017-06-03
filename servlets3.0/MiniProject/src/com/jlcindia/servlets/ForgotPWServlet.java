package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import com.jlcindia.userservice.UserService;
import com.jlcindia.mail.MailService;

@WebServlet(name="forgotpw",urlPatterns={"/forgotpw.jlc"})
public class ForgotPWServlet extends HttpServlet{
UserService us=null;
public void init(ServletConfig sc){
	us=new UserService();
}
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
	String em=req.getParameter("email");
	String pw=us.getPasswordByEmail(em);
	String result="";
	if(pw!=null){
		result="pwstatus.jsp";
		String sub="Your Password Here!";
		String body="<h1>Hi Your Password is "+pw+"</h1>";
		MailService.sentMail(em, sub, body);
	}else{
		String msg="Invalid Email-Try Again";
		req.setAttribute("MSG", msg);
		result="forgotpw.jsp";
	}
	RequestDispatcher rd=req.getRequestDispatcher(result);
	rd.forward(req, res);
}
}
