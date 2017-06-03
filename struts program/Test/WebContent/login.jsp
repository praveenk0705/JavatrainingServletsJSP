<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JS Validation</title>
    </head>
    <body>
       <div style="color:red">
            <html:errors />
        </div>


 <html:form action="/Login" name="LoginForm" type="emp.LoginForm">

<table border="0" width="100%">

  <tr>
    <th align="right">
  User Name
    </th>
    <td align="left">
       <html:text property="userName" /> 
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
    <td align="right">
      <html:submit property="submit" value="Login"/>
    </td>
    <td align="left">
      <html:reset/>
    </td>
  </tr>
</table>
 </html:form>
    </body>
</html>
