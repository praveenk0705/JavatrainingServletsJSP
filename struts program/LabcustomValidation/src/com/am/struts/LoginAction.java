package com.am.struts;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
public class LoginAction extends Action {
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res) throws Exception{
		LoginForm lf=(LoginForm)af;
		String un=lf.getUsername();
		String pw=lf.getPassword();
		
		
		ActionForward forward=am.findForward("success");
		return forward;
	
		
	}

}
