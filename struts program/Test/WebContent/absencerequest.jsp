
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
 <center><b>Absence Request</b></center>
<html:form action="requestProcess" focus="name" name="requestForm" type="emp.RequestProcessForm">

         <table border="0" width="100%">

  <tr>
    <th align="right">
       Name
    </th>
    <td align="left">
      <html:text  property="name" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <th align="right">
       Phone
    </th>
    <td align="left">
      <html:text  property="phone" size="16" maxlength="16"/>
    </td>
  </tr>
  
  
  <tr>
    <th align="right">
       Email:
    </th>
    <td align="left">
      <html:text  property="email" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <th align="right">
       From
    </th>
    <td align="left">
      <html:text  property="from" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <th align="right">
       To:
    </th>
    <td align="left">
      <html:text  property="to" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <th align="right">
       Type:
    </th>
    <td align="left">
      <html:text  property="type" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <th align="right">
       No. Of Hour:
    </th>
    <td align="left">
      <html:text  property="hour" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <th align="right">
       Discription:
    </th>
    <td align="left">
      <html:text  property="description" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <th align="right">
       Creation Date Time:
    </th>
    <td align="left">
      <html:text  property="datetime" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <th align="right">
       Leave Request:
    </th>
    <td align="left">
      <html:hidden property="leave" />
    </td>
  </tr>
  <tr>
    <th align="right">
       Comments
    </th>
    <td align="left">
      <html:text  property="comments" size="16" maxlength="16"/>
    </td>
  </tr>
  <tr>
    <td align="right">
      <html:submit property="submit" value="Submit"/>
    </td>
        </table>
         
        </html:form>
        
</body>
</html>