 <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Contact</title>
</head>
<body>
<center>
<h1>Java Learning Center</h1>
<h2>Search Form</h2>
<html:form action="/SearchContactSubmit">
<table>
<tr><td>Email Id</td>
<td><html:text property="email"/>
<html:errors property="email"/></td></tr></table>
<html:submit value="serchContact"/>

</html:form>
</center>
</body>
</html>