package com.sk.struts;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
public class LoginAction extends Action {
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res) throws Exception{
		LoginForm lf=(LoginForm)af;
		String un=lf.getUsername();
		String pw=lf.getPassword();
		String status=null;
		/*if(un.equals(pw)){
			status="success";
			req.setAttribute("UN",un );
		}
		else
		{
			status="failed";
			req.setAttribute("EMSG","Invalid user name and password");
		}*/
		ActionForward forward=am.findForward("success");
		return forward;
	
		
	}

}
