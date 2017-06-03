package com.jlcindia;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.ValidatorAction;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
public class jlcfieldChecks {
public static	boolean validateLogin(Object obj,ValidatorAction va,Field f,ActionErrors ar,HttpServletRequest req){
	String uname=req.getParameter("username");
	boolean a=false;
	if(!uname.equals("a")){
		a=true;
		ar.add("username",new ActionError("error.sid.format1"));
	}
	
return a;
	}

}
