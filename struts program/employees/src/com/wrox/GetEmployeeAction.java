package com.wrox;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import sun.nio.cs.ext.ISCII91;



public class GetEmployeeAction extends Action{
	
	protected ActionForm buildEmployeeForm(String username,HttpServletRequest request)
	throws Exception
	{
		EmployeeForm form = null;
		Employee employee=EmployeeData.getEmployee(username);
		if(employee!=null)
		{
			form=new EmployeeForm();
			form.setUsername(employee.getUsername());
			form.setPassword(employee.getPassword());
			form.setDepid(employee.getDepid().toString());
			form.setName(employee.getName());
			form.setPhone(employee.getPhone());
			form.setEmail(employee.getEmail());
			form.setRoleid(employee.getRoleid().toString());
		}
		else
		{
			throw new Exception(username+"not found!");
		}
		return form;
	}
	
 public ActionForward execute(ActionMapping mapping,ActionForm form,
		 HttpServletRequest request,HttpServletResponse response) 
 throws IOException,ServletException
 {
	 String target=new String("success");
	if(isCancelled(request))
	 {
		 return(mapping.findForward(target));
	}
	 try
	 {
		form=buildEmployeeForm(request.getParameter("username"),request);
		 if("request".equals(mapping.getScope()))
		 {
			 request.setAttribute(mapping.getAttribute(), form);
		 }
		 else
		 {
			 HttpSession session=request.getSession();
			 session.setAttribute(mapping.getAttribute(),form);
	 }
 }
	 catch(Exception e)
	 {
		 System.err.println("Setting tagret to error");
		 System.err.println("----->"+e.getMessage()+"<------");
		 target=new String("error");
		 ActionErrors errors=new ActionErrors();
		errors.add(ActionErrors.GLOBAL_ERROR,new ActionError("errors.database.error",
				e.getMessage()));
		if(!errors.isEmpty())
		{
			saveErrors(request,errors);
		}
	 }
 return(mapping.findForward(target));
	}





}
