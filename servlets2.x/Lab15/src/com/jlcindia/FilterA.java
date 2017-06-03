package com.jlcindia;

import java.io.IOException;
import javax.servlet.*;

public class FilterA implements Filter{
	public void init(FilterConfig fc) {
	System.out.println("FilterA-init()");	
	}
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain fc) throws IOException, ServletException {
		System.out.println("FilterA-doFilter()");
		String nm=req.getParameter("fname");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println("FilterA-before calling");
		fc.doFilter(req, res);
		System.out.println("FilterA-after calling");
		String msg=req.getAttribute("MSG").toString();
		System.out.println(msg);
	}
	public void destroy() {
	System.out.println("FilterA-destroy()");	
	}
}
