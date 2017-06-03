package com.jlcindia;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="fb",urlPatterns={"/a.jlc"})
public class FilterB implements Filter {
	public void init(FilterConfig fc) {
		System.out.println("FilterB-init()");
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc) throws IOException, ServletException {
		System.out.println("FilterB-doFilter()");
		String nm=req.getParameter("fname");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		System.out.println("FilterB-before calling");
		fc.doFilter(req, res);
		System.out.println("FilterB-after calling");
		String msg=req.getAttribute("MSG").toString();
		System.out.println(msg);
	}
	public void destroy() {
		System.out.println("FilterB-destroy()");	
	}

}
