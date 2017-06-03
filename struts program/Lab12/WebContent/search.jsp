<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search </title>
</head>
<body>
<h1><bean:message key="label.header"/></h1>
<html:form action="/Search.do">
<html:text property="hello"/>
<Br><html:submit value="Search"/>
</html:form><hr>
<html:link forward="english">English</html:link>&nbsp;&nbsp;
<html:link forward="hindi">Hindi</html:link>&nbsp;&nbsp;
<html:link forward="kannada">Kannada</html:link>&nbsp;&nbsp;
<html:link forward="telugu">Telugu</html:link>&nbsp;&nbsp;
<html:link forward="tamil">Tamil</html:link>&nbsp;&nbsp;
</body>
</html>