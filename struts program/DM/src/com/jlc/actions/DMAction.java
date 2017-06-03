package com.jlc.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import com.jlc.beans.LoginForm;

public class DMAction extends ServiceFactory {
	public ActionForward showDownload(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="download";
		DynaActionForm daf=(DynaActionForm)form;
		String cat=daf.get("cat").toString();
		List<String> dname=dmService.showDownload(cat);
		request.setAttribute("DNAME", dname);
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
