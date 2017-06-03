package com.jlc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
HttpSession session=request.getSession();
String username=(String)PropertyUtils.getSimpleProperty(form, "username");
String password=(String)PropertyUtils.getSimpleProperty(form, "password");
if(username.equals(password)){
	session.setAttribute("user",username);
}
	return mapping.findForward("success");
}
}
