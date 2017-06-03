package com.jlcindia;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="sb",urlPatterns={"/b.jlc"},loadOnStartup=1)
public class ServletB extends HttpServlet{
	public void init(ServletConfig sc){
		System.out.println("ServletB-init()");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("ServletB-doPost()");
		String nm=req.getParameter("fname");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		String msg="<h1>Hello "+nm+" <br>Your email is "+em;
		msg=msg+"<br>Your ip is "+ip;
		req.setAttribute("MSG", msg);
		RequestDispatcher rd=req.getRequestDispatcher("c.jlc");
		rd.forward(req, res);
	}
	public void destroy(){
		System.out.println("ServletB-destroy()");
	}
}
