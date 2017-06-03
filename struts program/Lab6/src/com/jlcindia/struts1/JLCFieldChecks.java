package com.jlcindia.struts1;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.ValidatorAction;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;

public class JLCFieldChecks {
	
public static boolean coursesRequired(Object obj,ValidatorAction va,Field f,ActionErrors errors,HttpServletRequest req){
	
	String[] c=req.getParameterValues("course");
	System.out.println("course="+c);
	System.out.println("in validateCourse");
	
     
             if(c!=null)
             {
            	 System.out.println("1");
                 if(c.length==0 ||c==null){
			                     System.out.println("2");
			                     errors.add("course", new ActionError("errors.course.required"));
			                      return false;
		             }
             }
             else
             {
            	 System.out.println("3");
                 errors.add("course", new ActionError("errors.course.required"));
                  return false; 
             }

	return true;
	}


	
}



