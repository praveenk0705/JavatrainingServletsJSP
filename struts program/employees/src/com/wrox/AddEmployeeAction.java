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

public class AddEmployeeAction extends Action {
	
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
		Employee employee=new Employee();
		EmployeeForm employeeForm=(EmployeeForm)form;
		employee.setUsername(employeeForm.getUsername());
		employee.setPassword(employeeForm.getPassword());
		employee.setRoleid(new Integer(employeeForm.getRoleid()));
		employee.setName(employeeForm.getName());
		employee.setPhone(employeeForm.getPhone());
		employee.setEmail(employeeForm.getEmail());
		employee.setDepid(new Integer(employeeForm.getDepid()));
		EmployeeData.addEmployee(employee);
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
