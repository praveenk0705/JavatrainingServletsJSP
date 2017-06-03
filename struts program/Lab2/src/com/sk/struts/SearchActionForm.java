package com.sk.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;

public class SearchActionForm extends ActionForm {
private String sid;

	public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors=new ActionErrors();
		if(sid==null || sid.length()==0){
			errors.add("sid",new ActionError("error.sid.required"));
		}
		else if(!sid.startsWith("JLC-")){
			errors.add("sid",new ActionError("error.sid.format1"));
		}
		
		           
        try{
        	String x=sid.substring(4); 
			int y=Integer.parseInt(x);
           
	
			 if(y<101 || y >999)
		    {
			errors.add("sid",new ActionError("error.sid.format2"));
			}
			
	}		

catch(Exception e){
	
	errors.add("sid",new ActionError("error.sid.format3"));
			}
		
		
				return errors;

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	this.sid=null;
	
	
	}

}
