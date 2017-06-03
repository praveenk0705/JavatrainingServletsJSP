package com.jlcindia.struts1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DownloadListAction extends Action {
	
	
public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws
			IOException,ServletException
			{
		                  String target = new String("success");
		                  ArrayList<Download> download=null;
		                  System.out.println("1ddds");    
                          download=DownloadData.getEmployees();  
	                      System.out.println("downloads");
		                  request.setAttribute("DLOAD",download);
		                  return(mapping.findForward(target));
		                  
		                		  }



	}

	

	
		


	

	


