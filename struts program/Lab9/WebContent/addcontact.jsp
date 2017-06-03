<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Contact</title>
</head>
<body>
<center>
<h1>Java Learning Center</h1>
<h2>Add Form</h2>
<html:form action="/AddContactSubmit">
<table>
<tr><td>First Name</td>
<td><html:text property="fname"/>
<html:errors property="fname"/></td></tr>
<tr><td>Last Name</td>
<td><html:text property="lname"/>
<html:errors property="lname"/></td></tr>
<tr><td>Email Id</td>
<td><html:text property="email"/>
<html:errors property="email"/></td></tr>
<tr><td>Phone No</td>
<td><html:text property="phone"/>
<html:errors property="phone"/></td></tr>
<tr><td colspan="3" align="center">
<html:submit value="Add Contact"/></td></tr>
</table>
</html:form>
</center>
</body>
</html>