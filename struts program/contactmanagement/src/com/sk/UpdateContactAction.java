package com.sk;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class UpdateContactAction extends Action {
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	DynaActionForm daf=(DynaActionForm)form;
	String un=daf.get("uname").toString();
	String pw=daf.get("password").toString();
	System.out.println(un);
	System.out.println(pw);
	
	
	
	
	return mapping.findForward("success");
}
}
