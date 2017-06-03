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
<br>
<br>
<center><font size="5" color="red">Java Learning Center</font><br>
<logic:notPresent name="user" scope="session">
<html:form action="/LoginSubmit">
<table>
<tr><td align="center" colspan="2"><h1>Account Login</h1></td></tr>
<tr><td>Username:</td><td><html:text property="username"/></td></tr>
<tr><td>Password:</td><td><html:password property="password"/></td></tr>
<tr><td align="center" colspan="2"><html:submit value="Login"/></td></tr>
</table>
</html:form>
</logic:notPresent>
<hr>
<logic:present name="user" scope="session">
<ul>
<li>
<html:link action="/changeModule?prefix=/fees&amp;page=/feeshome.jsp">Fees Module</html:link></li>
<li>
<html:link action="/changeModule?prefix=/enquiry&amp;page=/enquiryhome.jsp">Enquiry Module</html:link></li>
<li>
<html:link action="/changeModule?prefix=/student&amp;page=/studenthome.jsp">Student Module</html:link></li>
</ul>
</logic:present>
</center>
</body>
</html>