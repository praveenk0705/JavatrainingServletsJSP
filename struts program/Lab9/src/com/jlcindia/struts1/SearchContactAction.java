package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SearchContactAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="searchcontactresults";
		SearchContactForm cf=(SearchContactForm)form;
		
		String em=cf.getEmail();
		
		System.out.println("In SearchContact Action");
		
		System.out.println(em);
		cf.setFname("Srinivas");
		cf.setLname("Dande");
		cf.setPhone("999999");
		HttpSession session=request.getSession();
		session.setAttribute("EDIT","FALSE");
		
		
		return mapping.findForward(status);
	}
}
