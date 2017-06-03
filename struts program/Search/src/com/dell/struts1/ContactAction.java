package com.dell.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class ContactAction extends JLCBaseDispatchAction {

		public ActionForward searchContact(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception {
System.out.println("searchContact()-ContactAction");
request.getSession().removeAttribute("EDIT");
ContactForm cf=(ContactForm)form;
ContactTO cto=contactService.getContactByEmail(cf.getEmail());
if(cto==null){
	request.setAttribute("NOT_FOUND","No Record found with email"+cf.getEmail());
	return mapping.findForward("notfound");
}
else
{
	cf.setContactId(cto.getContactId());
	cf.setFname(cto.getFname());
	cf.setLname(cto.getLname());
	cf.setPhone(cto.getPhone());
	cf.setStatus(cto.getStatus());
}
			return mapping.findForward("updatecontact");
		}
			}
		
		
		

