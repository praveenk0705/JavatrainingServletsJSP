<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/AddContact">
UserName <html:text property="uname"/><br/>
Password <html:password property="password"/>
<html:submit/>
</html:form>
</body>
</html>