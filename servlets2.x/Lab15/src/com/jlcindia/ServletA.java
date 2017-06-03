package com.jlcindia;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletA extends HttpServlet{
	public void init(ServletConfig sc){
		System.out.println("ServletA-init()");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("ServletA-doPost()");
		String nm=req.getParameter("fname");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		String msg="<h1>Hello "+nm+" <br>Your email is "+em;
		msg=msg+"<br>Your ip is "+ip;
		req.setAttribute("MSG", msg);
		RequestDispatcher rd=req.getRequestDispatcher("b.jlc");
		rd.forward(req, res);
	}
	public void destroy(){
		System.out.println("ServletA-destroy()");
	}
}
