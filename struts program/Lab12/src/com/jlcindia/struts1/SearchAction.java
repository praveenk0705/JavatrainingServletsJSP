package com.jlcindia.struts1;

import org.apache.struts.action.*;
import java.util.*;
import javax.servlet.http.*;

public class SearchAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	DynaActionForm df=(DynaActionForm)form;
	String h=df.get("hello").toString();
	System.out.println(h);
	HttpSession hs=request.getSession();
	Locale lo=(Locale)hs.getAttribute(Action.LOCALE_KEY);
	System.out.println("current locale i"+lo.getLanguage());
	return mapping.findForward("results");
	}
}
