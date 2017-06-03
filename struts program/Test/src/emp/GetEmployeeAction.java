package emp;

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

public class GetEmployeeAction extends Action

{
     
	protected ActionForm buildEmployeeForm(String username,HttpServletRequest request)throws Exception
	{
	EmployeeForm form=null;
	Employee employee=null;
	
  employee =EmployeeData.getEmployee(username,request);
                     	
if(employee!=null)
{
		form =new EmployeeForm();
		form.setUsername(employee.getUsername());
		form.setPassword(employee.getPassword());
	}
	else
	{
		throw new Exception(username+"nottttttttt found!");
	}
	return form;
	
}
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException
	{
		String target=new String("success");
		if(isCancelled(request))
		{
			return(mapping.findForward(target));
			
		}
		try
		{
			System.out.println("buitd");
			
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
			System.err.println("setting target to error");
			System.err.println("------->"+e.getMessage()+"<-------");
			ActionErrors errors=new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR,new ActionError("errors.database.error",e.getMessage()));
		
			if(!errors.empty())
			{
				saveErrors(request,errors);
				
			}
	
		}
		return (mapping.findForward(target));
	}
}

	