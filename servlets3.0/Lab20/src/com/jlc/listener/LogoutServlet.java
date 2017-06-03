package com.jlc.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name="logout",urlPatterns={"/logout.jlc"},loadOnStartup=1)
public class LogoutServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res){
	try{
		HttpSession sess=req.getSession();
		sess.invalidate();
		RequestDispatcher rd=req.getRequestDispatcher("logout.html");
		rd.forward(req, res);
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
