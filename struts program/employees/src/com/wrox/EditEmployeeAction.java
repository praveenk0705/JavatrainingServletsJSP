package com.wrox;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class EditEmployeeAction extends Action {
	
	protected void editEmployee(EmployeeForm form,HttpServletRequest request)throws Exception
	{
		Employee employee=new Employee();
		//EmployeeForm employeeForm=(EmployeeForm)form;
		//employee.setUsername(employeeForm.getUsername());
		employee.setPassword(form.getPassword());
		employee.setRoleid(new Integer(form.getRoleid()));
		employee.setName(form.getName());
		employee.setPhone(form.getPhone());
		employee.setEmail(form.getEmail());
		employee.setDepid(new Integer(form.getDepid()));
		employee.setUsername(form.getUsername());
		System.out.println("1");
		EmployeeData.updateEmployee(employee);
		
		
	}
	
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException 
		{
	// TODO Auto-generated method stub
	String target=new String("success");
	
	try
	{
		if(isCancelled(request))
		{
			return (mapping.findForward("success"));
		}
		editEmployee((EmployeeForm)form,request);
		
		
		
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
