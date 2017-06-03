<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/AddContactSubmit">
<html:text property="sname"/>
<html:text property="email"/>
<html:text property="phone"/>
<html:submit></html:submit>
 </html:form>
</body>
</html>