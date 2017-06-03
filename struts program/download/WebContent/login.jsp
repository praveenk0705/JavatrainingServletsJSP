<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<bean:message key="label.header"/>
<h2>Login Form</h2>
<html:form action="/LoginSubmit.do?method=verifyUser">
<font color="red" size="5">${EMSG }</font> 
<table>
<tr><td>Username</td>
<td><html:text property="username"/>
</td>
<td><html:errors property="username"/></td>
</tr>
<tr><td>Password</td>
<td><html:password property="password"/></td>
<td><html:errors property="password"/></td>
</tr>
<tr><td colspan="3" align="center">
<html:submit value="Login"/>
</table>
</html:form>
</body>
</html>