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
<html:form action="/UpdateContactSubmit.do?m=updateContact">

<table style="font-size:25">
<tr><td>Contact ID</td>
<td>${contactForm.contactId }
</td><td></td></tr>

<tr><td>First Name</td>
<td><html:text property="fname" value="${contactForm.fname}"/></td>
<td><html:errors property="fname"/></td>
</tr>
<tr><td>Last Name</td>
<td><html:text property="lname" value="${contactForm.lname}"/></td>
<td><html:errors property="lname"/></td>
</tr>
<tr><td>Email Id</td>
<td><html:text property="email" value="${contactForm.email}"/></td>
<td><html:errors property="email"/></td>
</tr>
<tr><td>Phone</td>
<td><html:text property="phone" value="${contactForm.phone}"/></td>
<td><html:errors property="phone"/></td>
</tr>
<tr><td>status</td>
<td><html:select property="status" value="${contactForm.status}">
<html:option value="Enabled">Enabled</html:option>
<html:option value="Disabled">Disabled</html:option>
</html:select>
</td>
<td><html:errors property="staus"/></td>
</tr>
<tr><td colspan="2" align="center">
<html:submit value="Update Contact"/>
</table>
</html:form>
</body>
</html>