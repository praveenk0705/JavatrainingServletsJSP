package com.jlcindia.struts1;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
public class AddContactAction extends Action {
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	String status="addcontactstatus";
	ContactForm cf=(ContactForm)form;
	String fn=cf.getFname();
	String ln=cf.getLname();
	String em=cf.getEmail();
	String ph=cf.getPhone();
	System.out.println("In AddContact Action");
	System.out.println(fn);
	System.out.println(ln);
	System.out.println(em);
	System.out.println(ph);
	return mapping.findForward(status);
}
}
