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

<logic:iterate id="employees" name="employees">
<tr align="left">
<td>

<bean:write name="employees" property="username"/>
</td>


<td>
<a href="Edit.do?username=<bean:write name="employees" property="username"/>">Edit</a>
<a href="Delete.do?username=<bean:write name="employees" property="username"/>">Delete</a>
</td>
</logic:iterate>
<tr>
<td colspan="7">
<hr><form>
					
				</form>
</td>
</tr>
</table>
<font size="-1" face="arial">
<a href="addemployee.jsp">Add New Employee</a></font>


</body>

</html>