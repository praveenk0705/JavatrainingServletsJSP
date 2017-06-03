 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/Add" name="employeeForm" type="emp.EmployeeForm">

<table border="0" width="100%">

  <tr>
    <th align="right">
  User Name
    </th>
    <td align="left">
       <html:text property="username" /> 
    </td>
  </tr>

  <tr>
    <th align="right">
      password
    </th>
    <td align="left">
      <html:password  property="password" /> <br>

    </td>
  </tr>

  <tr>
    <td colspan="2" align="center">
      <html:submit/>
      <html:cancel></html:cancel>
      <html:reset/>
    </td>
  </tr>
</table>
 </html:form>
</body>