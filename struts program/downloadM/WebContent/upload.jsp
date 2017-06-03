<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload</title>
</head>
<body>
<font color="green" size="5">Hai ${loginForm.username}Sir</font><br/>
<logic:present name="fileExist" >
<% Object o=request.getAttribute("fileExist");
String flag=o.toString();
if(flag.equals("false"))
{ %>
<font color="teal" size="4">File with the name ${fileName } is uploaded successfully</font>
<%}
else{
%>
<font color="red" size="4">File with the name ${fileName } is already exists</font>
<%
}%>
</logic:present><br/>
<font color="blue" size="5">Upload File</font>
<br/>
<html:form action="/Upload.do?method=uploadFile" enctype="multipart/form-data">
<table>
<tr><td align="center" colspan="2" >Browse the file to upload.</td>
<td align="left" ><html:file property="theFile"/></td></tr>
<tr><td align="center" colspan="4"><html:submit value="upload"/></td></tr>
</table>
</html:form>
</body>
</html>