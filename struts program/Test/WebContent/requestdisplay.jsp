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
<html:form action="requestdisplay" name="requestDisplay" type="emp.RequestDisplayForm">
<table border="0" width="100%">

  <tr>
    <th align="right">
     Email:
    </th>
    <td align="left">
      <html:text property="email" size="16" maxlength="16"/>
    </td>
  </tr>
  
  <tr>
    <td align="right">
      <html:submit property="submit"/>
    </td>
    </tr>
</table>
</html:form>
</body>
</html>