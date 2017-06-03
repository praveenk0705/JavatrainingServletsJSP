package com.arvind.jsf;

import java.util.Map;

import javax.annotation.*;
import javax.faces.context.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ECDemoBean {
	String str = "Java Learning Center";

	public String getStr() {
		System.out.println("ECDemoBean.getStr()");
		return str;
	}

	public void setStr(String str) {
		System.out.println("ECDemoBean.setStr()");
		this.str = str;
	}

	public ECDemoBean() {
		System.out.println("ECDemoBean.ECDemoBean()");
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		ServletContext sc = (ServletContext) ec.getContext();
		sc.setAttribute("Country1", "INDIA");
		sc.setAttribute("Country2", "INDIA");

		HttpSession session = (HttpSession) ec.getSession(true);
		session.setAttribute("STATE1", "KA");
		session.setAttribute("STATE2", "KA");

		HttpServletRequest req = (HttpServletRequest) ec.getRequest();
		req.setAttribute("CITY1", "Bangalore");
		req.setAttribute("CITY2", "Bangalore");
		System.out.println("Data is stored successfully");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("ECDemoBean.myInit()");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("ECDemoBean.myDestroy()");
	}

	public String show() {
		System.out.println("ECDemoBean.show()");
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		ServletContext sc = (ServletContext) ec.getContext();
		System.out.println(sc.getAttribute("Country1"));
		System.out.println(sc.getAttribute("Country2"));
		System.out.println("--------------");

		HttpSession session = (HttpSession) ec.getSession(true);
		System.out.println(session.getAttribute("STATE1"));
		System.out.println(session.getAttribute("STATE2"));
		System.out.println("--------------");

		HttpServletRequest req = (HttpServletRequest) ec.getRequest();
		System.out.println(req.getAttribute("CITY1"));
		System.out.println(req.getAttribute("CITY2"));
		System.out.println("---------------");

		Map<String, Object> ctxmap = ec.getApplicationMap();
		ctxmap.put("SID", "999");
		displayMap2(ctxmap);
		System.out.println("----------------");

		Map<String, Object> sesmap = ec.getSessionMap();
		sesmap.put("SID", "888");
		displayMap2(sesmap);
		System.out.println("----------------");

		Map<String, Object> reqmap = ec.getRequestMap();
		reqmap.put("SID", "777");
		displayMap2(reqmap);
		System.out.println("----------------");

		Map<String, String> ctxParams = ec.getInitParameterMap();
		displayMap1(ctxParams);
		System.out.println("----------------");

		Map<String, String> reqParams = ec.getRequestParameterMap();
		displayMap1(reqParams);
		System.out.println("----------------");

		Map<String, String> reqHeaders = ec.getRequestHeaderMap();
		displayMap1(reqHeaders);
		System.out.println("----------------");

		Map<String, Object> reqCookies = ec.getRequestCookieMap();
		displayMap2(reqCookies);
		System.out.println("----------------");

		return "show";
	}

	private void displayMap1(Map<String, String> map) {
		System.out.println("ECDemoBean.displayMap1()");
		for (Map.Entry<String, String> me : map.entrySet()) {
			System.out.println(me.getKey() + "---" + me.getValue());
		}
	}

	private void displayMap2(Map<String, Object> map) {
		System.out.println("ECDemoBean.displayMap2()");
		for (Map.Entry<String, Object> me : map.entrySet()) {
			System.out.println(me.getKey() + "---" + me.getValue());
		}
	}

}
