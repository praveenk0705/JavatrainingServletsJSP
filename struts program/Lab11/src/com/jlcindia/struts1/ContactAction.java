package com.jlcindia.struts1;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.validator.DynaValidatorForm;
public class ContactAction extends DispatchAction {
public ActionForward addContact(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	String status="addcontactstatus";
	DynaValidatorForm dvf=(DynaValidatorForm)form;
	String fn=dvf.get("fname").toString();
	String ln=dvf.get("lname").toString();
	String em=dvf.get("email").toString();
	String ph=dvf.get("phone").toString();
	System.out.println("In AddContact Action");
	ContactTO cto=new ContactTO();
	cto.setFname(fn);
	cto.setLname(ln);
	cto.setEmail(em);
	cto.setPhone(ph);
	HttpSession session=request.getSession();
	session.setAttribute("CTO", cto);
	System.out.println(fn);
	System.out.println(ln);
	System.out.println(em);
	System.out.println(ph);
	return mapping.findForward(status);
}
public ActionForward editContact(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	String status="searchcontactresults";
	
	HttpSession session=request.getSession();
	session.setAttribute("EDIT","TRUE");
	return mapping.findForward(status);
}
public ActionForward  searchContact(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	String status="searchcontactresults";
	DynaValidatorForm dvf=(DynaValidatorForm)form;
	
	String em=dvf.get("email").toString();
	
	System.out.println("In SearchContact Action");
	
	System.out.println(em);
	ContactTO cto=new ContactTO();
	cto.setFname("Srinivas");
	cto.setLname("Dande");
	cto.setEmail(em);
	cto.setPhone("999999");
	
	HttpSession session=request.getSession();
	session.setAttribute("EDIT","FALSE");
	session.setAttribute("CTO", cto);
	
	return mapping.findForward(status);
}
public ActionForward updateContact(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	String status="updatecontactstatus";
	DynaValidatorForm dvf=(DynaValidatorForm)form;
	String fn=dvf.get("fname").toString();
	String ln=dvf.get("lname").toString();
	String em=dvf.get("email").toString();
	String ph=dvf.get("phone").toString();
	System.out.println("In UpdateContact Action");
	System.out.println(fn);
	System.out.println(ln);
	System.out.println(em);
	System.out.println(ph);
	return mapping.findForward(status);
}
}
