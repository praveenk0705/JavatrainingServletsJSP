package com.jlc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

public class UploadAction extends DispatchAction {

public ActionForward uploadFile(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException {
	// TODO Auto-generated method stub
DynaActionForm df=(DynaActionForm)form;
FormFile theFile=(FormFile)df.get("theFile");
String contentType=theFile.getContentType();
String fileName=theFile.getFileName();
int fileSize=theFile.getFileSize();
byte[] fileData=theFile.getFileData();
String fileExist="false";
String filePath="C:/uploadfiles";
if(!fileName.equals("")){
	File fileToCreate=new File(filePath,fileName);
	if(!fileToCreate.exists()){
		FileOutputStream fileOutStream=new FileOutputStream(fileToCreate);
		fileOutStream.write(theFile.getFileData());
		fileOutStream.flush();
		fileOutStream.close();
		request.setAttribute("fileName",fileName);
		request.setAttribute("filePath",filePath);
		
		
	}
	else
	{
		fileExist="true";
		request.setAttribute("fileName",fileName);
		
	}
	request.setAttribute("fileExist",fileExist);
	
}
return mapping.findForward("success");
}
}
