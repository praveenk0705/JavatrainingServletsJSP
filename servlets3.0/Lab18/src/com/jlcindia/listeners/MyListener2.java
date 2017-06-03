package com.jlcindia.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener2 implements ServletContextAttributeListener{
	public MyListener2(){
		System.out.println("MyListener2....");
	}
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("attributeAdded...");
		System.out.println(scae.getName()+"\t"+scae.getValue());
	}
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("attributeRemoved...");
		System.out.println(scae.getName()+"\t"+scae.getValue());
	}
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("attributeReplaced...");
		System.out.println(scae.getName()+"\t"+scae.getValue());
	}
}
