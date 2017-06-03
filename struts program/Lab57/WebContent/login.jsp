  <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >
   
<table heigh="100%" width="100%" background="d.jpg">
       
        <html:form action="/Login" > 
          
            <div style="color:red"><html:errors property="invalid"/></div></td></tr>
 
            <tr><td>User Name </td><td> <html:text  property="username" /> </td>
            <td> <html:errors  property="username" /> </td></tr><br>
            <br/>
            <tr><td>Password </td><td> <html:text  property="password" /> </td>
            <td> <html:errors  property="password" /> </td></tr>
            <tr><td colspan="3"><html:submit value="Login" /></td></tr>
 </html:form>
        </table>
		
		
		
	</center>
    </body>
</html>
