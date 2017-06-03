package com.wrox;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DeleteEmployeeAction extends Action {
	
	
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception 
		{
	// TODO Auto-generated method stub
	String target=new String("success");
	
	try
	{
		EmployeeData.removeEmployee(request.getParameter("username"));
		
		
		
	}
	catch(Exception e)
	{
		System.err.println("Setting target to error");
		target=new String("error");
		ActionErrors errors=new ActionErrors();
		errors.add(ActionErrors.GLOBAL_ERROR,
				new ActionError("errors.database.error",e.getMessage()));
		if(!errors.isEmpty())
		{
			saveErrors(request,errors);
			
		}
		
		
	}
	return(mapping.findForward(target));
	
}

}
