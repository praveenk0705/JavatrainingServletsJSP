package com.jlcindia.struts1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

public class DownloadAction extends DispatchAction {
public ActionForward downloadProfile(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException {
	
  
	
		
		DynaActionForm daf=(DynaActionForm)form;
		   String name=daf.get("downloadname").toString();
		   System.out.println("Hello.............");
		       Dowload d=new Dowload();
		       d.setDownloadname(name);
		       HttpSession s=request.getSession();
		       s.setAttribute("DO", d);
		       System.out.println("dowload name"+name);
		       try{
		String idocPath="C:/";
		
		//String fileName="hello.pdf";
		
		String filePath=idocPath+name;
		response.setContentType("APPLICATION/OCTET-STREAM");
		String disHeader="Attachment;Filename="+name;
		response.setHeader("Content-Disposition",disHeader);
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		int i;
		while((i=fis.read())!=-1){
			response.getOutputStream().write(i);
		}
		response.getOutputStream().flush();
		response.getOutputStream().close();
		fis.close();
	}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}
}

