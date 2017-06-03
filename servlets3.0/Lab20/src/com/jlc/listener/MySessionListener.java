package com.jlc.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

@WebListener
public class MySessionListener implements HttpSessionListener{
	ServletContext context=null;
	HttpSession session=null;
	public void sessionCreated(HttpSessionEvent hse) {
		session=hse.getSession();
		context=session.getServletContext();
		int tv=Integer.parseInt(context.getAttribute("TV").toString());
		tv++;
		int co=Integer.parseInt(context.getAttribute("CO").toString());
		co++;
		context.setAttribute("TV", new Integer(tv));
		context.setAttribute("CO", new Integer(co));
	}
	public void sessionDestroyed(HttpSessionEvent hse) {
		System.out.println("session destroyed");
		session=hse.getSession();
		context=session.getServletContext();
		int co=Integer.parseInt(context.getAttribute("CO").toString());
		co--;
		context.setAttribute("CO", new Integer(co));
	}
}
