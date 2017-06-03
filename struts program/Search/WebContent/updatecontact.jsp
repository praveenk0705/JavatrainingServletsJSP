<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
     <%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dell COntact</title>
</head>
<body>
<h1>Dell</h1>
<h2> Contact</h2>


<table style="font-size:25">
<tr><td>Contact ID</td>
<td>${contactForm.contactId }
</td><td></td></tr>

<tr><td>First Name</td>
<td>${contactForm.fname}</td>
<td><html:errors property="fname"/></td>
</tr>
<tr><td>Last Name</td>
<td>${contactForm.lname}</td>
<td><html:errors property="lname"/></td>
</tr>
<tr><td>Email Id</td>
<td>${contactForm.email}</td>
<td><html:errors property="email"/></td>
</tr>
<tr><td>Phone</td>
<td>${contactForm.phone}</td>
<td><html:errors property="phone"/></td>
</tr>


<tr><td colspan="2" align="center">

</table>

</body>
</html>