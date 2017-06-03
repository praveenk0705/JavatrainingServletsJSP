package com.jlcindia;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UpdateContactAction extends Action {
 public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception{
	 ContactForm cf=(ContactForm)af;

	 String sn=cf.getSname();
	 String em=cf.getEmail();
	 String ph=cf.getPhone();
	 	   
	 	  System.out.println(sn);
	 	  System.out.println(em);
	 	  System.out.println(ph);
	 	return am.findForward("success");
	   

}
}