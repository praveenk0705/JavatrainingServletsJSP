package com.jlc.listener;

import javax.servlet.*;
import java.util.*;

public class MyContextListener implements ServletContextListener{
	ServletContext context=null;
	public void contextInitialized(ServletContextEvent sce) {
		context=sce.getServletContext();
		ArrayList al=new ArrayList();
		al.add("Head First Java");
		al.add("Head First Servlet");
		al.add("Head First EJB");
		al.add("Mastering Java");
		al.add("Mastering Servlet");
		al.add("Mastering EJB");
		context.setAttribute("Book", al);
		Integer i=new Integer(0);
		context.setAttribute("TV", i);
		context.setAttribute("CO", i);
	}
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context destroyed");
	}
}
