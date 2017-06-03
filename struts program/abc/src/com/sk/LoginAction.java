package com.sk;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {

          LoginForm l=(LoginForm)form;
          String un=l.getUsername();
          System.out.println(l.getUsername());
          String status=null;
          if(un.equals("kundan")){
        	  status="success";
          }
          else
          {
        	status="failed";  
          }
          
          return mapping.findForward(status);
}
}
