<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/Download">
<html:select property="username">
<logic:iterate id="emp" name="employees">
<html:option value="">
<bean:write name="emp" property="username"/>
</html:option>
</logic:iterate>
</html:select>





<%--
<logic:iterate id="emp" name="employees" >
<html:select name="emp" property="username">

<html:option value="a">
<bean:write name="emp" property="username"/>

</html:option>
</html:select>
</logic:iterate> <%--
<logic:iterate id="emp" name="employees" >

<bean:write name="emp" property="username"/>

</logic:iterate>
--%>

<html:submit value="Dowload"/>

 
</html:form>
</body>
</html>