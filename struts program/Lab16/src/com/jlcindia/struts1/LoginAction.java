package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {
	static{
		System.out.println("S.B LoginAction");
	}
	public LoginAction() {
		System.out.println("D.C LoginAction");
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("excute() LoginAction");
		LoginForm lf=(LoginForm)form;
		String un=lf.getUsername();
		String pw=lf.getPassword();
		String status=null;
		if(un.equals(pw)){
			status="success";
			request.setAttribute("UN", un);
			//lf.setUsername(un);
		}else{
			status="failed";
			request.setAttribute("EMSG", "Invalid UserName and Password");
		}
		ActionForward forward=mapping.findForward(status);
		return forward;
	}

}
