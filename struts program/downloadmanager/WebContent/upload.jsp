<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Upload File</h1>
<br><br>
<html:form action="/Upload.do?method=uploadFile" enctype="multipart/form-data">
<table>
<tr><td align="center" colspan="2" >Browse the file to upload.</td>
<td align="left" ><html:file property="theFile"/></td></tr>
<tr><td align="center" colspan="4"><html:submit value="upload"/></td></tr>



</table>




</html:form>





</center>
</body>
</html>