package com.jlcindia.struts1;

import org.apache.struts.action.*;
import java.util.*;
import javax.servlet.http.*;

public class LocaleAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	String l=request.getParameter("language");
	System.out.println(l);
	Locale loc=new Locale(l);
	HttpSession hs=request.getSession();
	Locale lo=(Locale)hs.getAttribute(Action.LOCALE_KEY);
	System.out.println("current locale i"+lo.getLanguage());
	hs.setAttribute(Action.LOCALE_KEY,loc);
	System.out.println("locale is changed to"+l);
	
	return mapping.findForward("search");
	}
}
