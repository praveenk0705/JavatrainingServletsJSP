package com.sk;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class LoginForm extends ActionForm {
private String username="ku";

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}


	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
           ActionErrors errors=new ActionErrors();
           if(username==null || username.length()<3){
        	   
        	   errors.add("username",new ActionError("abc"));
        	   
           }
           
           
           return errors;
           
		
	}
}
