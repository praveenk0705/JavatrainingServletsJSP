<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Contact Results</title>
</head>
<body>
<center>
<h1>Java Learning Center</h1>
<h2>Search Results</h2>
<logic:equal name="EDIT" scope="session" value="FALSE">

<table>
<tr><td>First Name</td>
<td>${sessionScope.CTO.fname }</td></tr>
<tr><td>Last Name</td>
<td>${CTO.lname }</td></tr>
<tr><td>Phone No.</td>
<td>${CTO.email }</td></tr>
<tr><td>Phone No</td>
<td>${CTO.phone }</td></tr>
</table>
<html:form action="/EditContactSubmit.do?method=editContact">
<html:submit value="Edit Contact"/>
</html:form>
</logic:equal>
<logic:equal name="EDIT" scope="session" value="TRUE">
<html:form action="/UpdateContactSubmit.do?method=updateContact">
<table>
<tr><td>First Name</td>
<td><html:text property="fname" value="${sessionScope.CTO.fname }"/>
<html:errors property="fname"/></td></tr>
<tr><td>Last Name</td>
<td><html:text property="lname" value="${CTO.lname }"/>
<html:errors property="lname"/></td></tr>
<tr><td>Email Id</td>
<td><html:text property="email" value="${CTO.email }"/>
<html:errors property="email"/></td></tr>
<tr><td>Phone No</td>
<td><html:text property="phone" value="${CTO.phone }"/>
<html:errors property="phone"/></td></tr>
<tr><td colspan="3" align="center">
<html:submit value="Update Contact"/></td></tr>
</table>
</html:form>
</logic:equal>
</center>
</body>
</html>