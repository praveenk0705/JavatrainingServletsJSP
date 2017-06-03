<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Download</title>
</head>
<body>
<center>
<html:form action="/showDownload.do?method=showDownload">
<table>
<tr><td>Select Catagory for Download</td></tr>
<tr><td><html:select property="cat">
<html:option value="jar">jar File</html:option>
<html:option value="tld">tld File</html:option>
<html:option value="xml">xml file</html:option>
</html:select></td></tr>
<tr><td colspan="3" align="center"><html:submit value="OK"/>
</td></tr>
</table>
</html:form>
</center>
</body>
</html>