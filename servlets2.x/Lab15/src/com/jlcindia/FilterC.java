package com.jlcindia;

import java.io.IOException;
import javax.servlet.*;

public class FilterC implements Filter {
	public void init(FilterConfig fc) {
		System.out.println("FilterC-init()");
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc) throws IOException, ServletException {
		System.out.println("FilterC-doFilter()");
		String nm=req.getParameter("fname");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println("FilterC-before calling");
		fc.doFilter(req, res);
		System.out.println("FilterC-after calling");
		String msg=req.getAttribute("MSG").toString();
		System.out.println(msg);
	}
	public void destroy() {
		System.out.println("FilterC-destroy()");	
	}
}
