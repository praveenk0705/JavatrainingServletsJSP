<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Java Learning Center</h1>
<h2>Your Contact has been added successfully<br>
with the following information</h2>
<table>
<tr><td>First Name</td>
<td>${sessionScope.contactform.fname }</td></tr>
<tr><td>Last Name</td>
<td>${contactform.lname }</td></tr>
<tr><td>Phone No.</td>
<td>${contactform.email }</td></tr>
<tr><td>Phone No</td>
<td>${contactform.phone }</td></tr>
</table>
</center>
</body>
</html>