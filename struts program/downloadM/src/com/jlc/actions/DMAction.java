package com.jlc.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.upload.FormFile;
import org.apache.struts.util.LabelValueBean;

import com.jlc.beans.DownloadBean;
import com.jlc.beans.LoginForm;
import com.jlc.beans.RegisterForm;
import com.jlc.beans.UpdateForm;

public class DMAction extends ServiceFactory {
	
	public ActionForward verifyUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="";
		LoginForm lf=(LoginForm)form;
		String un=lf.getUsername();
		String pw=lf.getPassword();
		String role=userService.verifyUser(un,pw);
		if(role.equals("student")){
			status="studenthome";
		}else if (role.equals("admin")) {
			status="adminhome";
		}else{
			status="default";
			request.setAttribute("EMSG", "No Record Found");
		}
		
		return mapping.findForward(status);
	}
	
	public ActionForward registerUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="";
		RegisterForm rf=(RegisterForm)form;
		String nm=rf.getName();
		String un=rf.getUsername();
		String pw=rf.getPassword();
		String rl=rf.getRole();
		int x=userService.registerUser(nm,un,pw,rl);
		if(x!=0){
		status="default";
			request.setAttribute("EMSG", "You have Successfully Regiter");
		}else {
			status="register";
			request.setAttribute("EMSG", "You have not Successfully Regiter try agin");
		}
		return mapping.findForward(status);
	}
	
	public ActionForward showDownload(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="download";
		List<DownloadBean> dload=dmService.showDownload();
		request.setAttribute("DLOAD", dload);
		return mapping.findForward(status);
	}
	
	public ActionForward download(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DynaActionForm dvf=(DynaActionForm)form;
		String name=dvf.get("dname").toString();
		System.out.println(name);
		try{
			String idocPath="E:/uploadfiles/";
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
	
	public ActionForward uploadFile(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException,ServletException {
	
	DynaActionForm df=(DynaActionForm)form;
	try{
	FormFile theFile=(FormFile)df.get("theFile");
	String contentType=theFile.getContentType();
	String fileName=theFile.getFileName();
	int fileSize=theFile.getFileSize();
	byte[] fileData=theFile.getFileData();
	String fileExist="false";
	String filePath="E:/uploadfiles";
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
		if(fileExist.equals("false")){
		dmService.addDownLoad(fileName);
		System.out.println(fileName);
		}
		request.setAttribute("fileExist",fileExist);
	}
	}catch (Exception e) {
			e.printStackTrace();
			}
	return mapping.findForward("adminhome");
	}
	
	public ActionForward getAllDownload(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="showalldownload";
		List<DownloadBean> dall=dmService.getAllDownload();
		HttpSession session=request.getSession();
		session.setAttribute("ALLDLOAD", dall);
		session.setAttribute("EDIT","FALSE");
		return mapping.findForward(status);
	}
	
	public ActionForward updateShow(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="showalldownload";
		List<DownloadBean> dall=dmService.getAllDownload();
		HttpSession session=request.getSession();
		session.setAttribute("ALLDLOAD", dall);
		session.setAttribute("EDIT","TRUE");
		return mapping.findForward(status);
	}
	
	public ActionForward updateDownload(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String status="showalldownload";
		UpdateForm uf=(UpdateForm)form;
		String id=uf.getId();
		String dname=uf.getDownloadname();
		String st=uf.getStatus();
		int x=dmService.updateDownload(id,dname,st);
		List<DownloadBean> dall=dmService.getAllDownload();
		HttpSession session=request.getSession();
		session.setAttribute("ALLDLOAD", dall);
		session.setAttribute("EDIT","TRUE");
		return mapping.findForward(status);
	}

}
