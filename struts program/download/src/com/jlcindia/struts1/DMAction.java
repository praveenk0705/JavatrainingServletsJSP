package com.jlcindia.struts1;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;



public class DMAction extends ServiceFactory {
	public ActionForward showDownload(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String status="success";
		DynaActionForm daf=(DynaActionForm)form;
		String cat=daf.get("downloadname").toString();
		List<Download> dname=dmService.showDownload();
		request.setAttribute("DLOAD", dname);
		return mapping.findForward(status);
	}
	public ActionForward verifyUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="";
		LoginForm lf=(LoginForm)form;
		String un=lf.getUsername();
		String pw=lf.getPassword();
		String role=userService.verifyUser(un,pw);
		if(role.equals("student")){
			status="studenthome";
		}else if (role.equals("admin")) {
			status="adminhome";
		}else{
			status="default";
			request.setAttribute("EMSG", "No Record Found");
		}
		
		return mapping.findForward(status);
	}

}
