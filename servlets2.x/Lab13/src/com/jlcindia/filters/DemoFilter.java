package com.jlcindia.filters;

import java.io.IOException;
import javax.servlet.*;

public class DemoFilter implements Filter{
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("DemoFilter-init()");
		String ci=fc.getInitParameter("City");
		System.out.println(ci);
	}
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException, ServletException {
		String nm=req.getParameter("name");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println("DemoFilter-doFilter()-before");
		
		chain.doFilter(req, res);
		
		System.out.println("DemoFilter-doFilter()-after");
		String msg=req.getAttribute("MSG").toString();
		System.out.println(msg);
	}
	public void destroy() {
		System.out.println("DemoFilter-destroy()");
	}
}
