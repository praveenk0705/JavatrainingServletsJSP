package com.jlcindia.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener1 implements ServletContextListener{
	public MyListener1(){
		System.out.println("MyListener1.....");
	}
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed...");
	}
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("contextInitialized...");
	}
}
