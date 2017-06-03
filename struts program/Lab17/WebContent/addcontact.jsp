<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
     <%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Java Learnig Center</h1>
<h2>Add Contact</h2>
<html:form action="/AddContactSubmit.do?method=addContact">

<table style="font-size:25">
<tr><td>First Name</td>
<td><html:text property="fname"/>
</td>
<td><html:errors property="fname"/></td>
</tr>
<tr><td>Last Name</td>
<td><html:text property="lname"/></td>
<td><html:errors property="lname"/></td>
</tr>
<tr><td>Email Id</td>
<td><html:text property="email"/></td>
<td><html:errors property="email"/></td>
</tr>
<tr><td>Phone</td>
<td><html:text property="phone"/></td>
<td><html:errors property="phone"/></td>
</tr>
<tr><td colspan="2" align="center">
<html:submit value="Add Contact"/>
</table>
</html:form>
</body>
</html>