package com.jlc.listener;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

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
