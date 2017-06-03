<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Download</title>
</head>
<body>
<font color="green" size="5">Hai ${loginForm.username}</font>
<html:form action="/Download.do?method=download">
<table>
<tr><td><font color="blue" size="4">Select For Download</font></td></tr>
<tr><td>
<html:select property="dname">
<html:options property="downloadname" labelProperty="downloadname" collection="DLOAD"/>
</html:select></td></tr>
<tr><td><html:submit value="Download Now"/> </td></tr>
</table>
</html:form>
</body>
</html>