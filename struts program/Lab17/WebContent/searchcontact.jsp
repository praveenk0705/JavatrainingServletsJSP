<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
        <%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<center>
<h1>Java Learning Center</h1>
<h1>Search Contact Form</h1>
<logic:present name="NOT_FOUND">
<table>
<tr><td><font color="red" size="6"><b>${NOT_FOUND}</b>
</font></td></tr></table>
</logic:present>
<html:form action="/SearchContactSubmit.do?method=searchContact">
<table style="font-size:25">
<tr><td>Email Id</td>
<td><html:text property="email"/></td>
<td><html:submit value="Show Contact"/></td></tr>
<tr><td>
<html:errors property="email"/></td></tr>

</table>


</html:form>
</center>
</body>
</html>