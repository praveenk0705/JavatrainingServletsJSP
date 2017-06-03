<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello Login List page
<table border="0">
<tr>
<td colspan="7">

				
<tr align="left">
<td>
<html:form action="/Download.do?method=downloadProfile">
<html:select property="downloadname">
<html:options property="downloadname" labelProperty="downloadname" collection="employees"/>
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
<html:submit value="download"/>


 
</html:form>
</td>


<td>
</td>
</tr><hr>
</td>
</tr>
</table>



</body>

</html>