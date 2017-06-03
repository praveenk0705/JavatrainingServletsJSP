<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<title>Register</title>
</head>
<body>
<center>
<html:form action="/RegisterSubmit.do?method=registerUser">
<font color="red" size="5">${EMSG }</font> 
<table>
<tr><td>Name</td>
<td><html:text property="name"/></td>
<td><html:errors property="name"/></td></tr>
<tr><td>User Name</td>
<td><html:text property="username"/></td>
<td><html:errors property="username"/></td></tr>
<tr><td>Password</td>
<td><html:password property="password"/></td>
<td><html:errors property="password"/></td></tr>
<tr><td>Role</td>
<td><html:select property="role">
<html:option value="student">Student</html:option>
<html:option value="admin">Admin</html:option>
</html:select>
</td>
<td><html:errors property="role"/></td></tr>
<tr><td colspan="3" align="center"><html:submit value="Register"/>
</td></tr>
</table>
</html:form>
<center>For Existing User<br>
<html:link forward="default">Login Here</html:link>
</center>
</center>
</body>
</html>