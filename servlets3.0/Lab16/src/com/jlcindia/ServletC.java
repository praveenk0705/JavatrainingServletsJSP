package com.jlcindia;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="sc",urlPatterns={"/c.jlc"},loadOnStartup=1)
public class ServletC extends HttpServlet{
	public void init(ServletConfig sc){
		System.out.println("ServletC-init()");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("ServletC-doPost()");
		String nm=req.getParameter("fname");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		String msg="<h1>Hello "+nm+" <br>Your email is "+em;
		msg=msg+"<br>Your ip is "+ip;
		req.setAttribute("MSG", msg);
		PrintWriter out=res.getWriter();
		out.println("<h1>"+msg);
	}
	public void destroy(){
		System.out.println("ServletC-destroy()");
	}
}

