<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="santosh.jpg">
<h1>${EMSG }</h1>
<html:form action="/LoginSubmit">
<tr>
<td>Username:</td>
<td><html:text property="username"/></td>
<td><html:errors property="username"/></td><br/>
</tr>
<tr>
<td>Password:</td>
<td><html:password property="password"/></td>
<td><html:errors property="password"/></td>
</tr><br/>
<tr>

<td colspan="2" align="center">
<html:submit value="Login"/>
</td>
</tr>
</html:form>
</body>
</html>