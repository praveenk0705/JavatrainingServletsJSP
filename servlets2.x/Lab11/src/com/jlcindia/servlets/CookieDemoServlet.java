package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieDemoServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		//1.Collect the Request parameters
		String em=req.getParameter("email");
		Cookie ck[]=req.getCookies();
		if(ck!=null){
			if(ck.length!=0){
				for(Cookie c:ck){
					String cn=c.getName();
					if(cn.equals("JSESSIONID")){
						System.out.println("You are the old user");
					}
					String cv=c.getValue();
					String d=c.getDomain();
					System.out.println(cn+"\t:"+cv+"\t:"+d);
				}
			}else{
				System.out.println("Sorry, Noooo Cookies Found");
			}
		}else{
			System.out.println("Sorry, Noooo Cookies Found");
		}
		HttpSession session=req.getSession();
		/*System.out.println(session.isNew());
		System.out.println(session.getId());
		System.out.println(session.getCreationTime());
		System.out.println(session.getLastAccessedTime());*/
		
		boolean b=session.isNew();
		if(b){
			System.out.println("You are the new User");
		}else{
			System.out.println("You are the old User");
		}
		Cookie c1=new Cookie("Email",em);
		res.addCookie(c1);
		Cookie c2=new Cookie("Phone","99999");
		res.addCookie(c2);
		
		RequestDispatcher rd=req.getRequestDispatcher("cookiedemo.jsp");
		rd.forward(req, res);
	}
}
