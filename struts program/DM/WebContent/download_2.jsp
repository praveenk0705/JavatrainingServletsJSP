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
<html:form action="/Download.do?download">
<table>
<tr><td>
<html:select property="dname">
<html:options property="dname" labelProperty="dname" collection="DNAME" ></html:options>
</html:select></td></tr>
<tr><td><html:submit value="Download Now"/> </td></tr>
</table>
</html:form>
<!--
<table border="1" width="75%">
<tr><td>Download Name</td></tr>
<logic:iterate id="list" name="DNAME">
<tr><td>${list }</td><td><html:submit value="Download"></html:submit></td>
</tr>
</logic:iterate>
</table>
 -->
</body>
</html>