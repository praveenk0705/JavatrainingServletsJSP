package com.jlc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class DownloadAction extends DispatchAction {
public ActionForward downloadProfile(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException {
	
	try{
		String idocPath="C:/";
		String fileName="hello.pdf";
		String filePath=idocPath+fileName;
		response.setContentType("APPLICATION/OCTET-STREAM");
		String disHeader="Attachment;Filename="+fileName;
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

