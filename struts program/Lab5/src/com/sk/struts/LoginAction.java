package com.sk.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;

public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DynaActionForm daf=(DynaActionForm)form;
		String un=daf.get("username").toString();
	    String pw=daf.get("password").toString();
	   
		String str="login";
		if(un.equals(pw))
		{
			str="success";
			request.setAttribute("UN",un);
		}
		
		{
			System.out.println("hello");
			ActionErrors errors=new ActionErrors();
			errors.add("invalid",new ActionError("login.invalid"));
			this.saveErrors(request,errors);
			
		}
		
		return mapping.findForward(str);
	}



}
