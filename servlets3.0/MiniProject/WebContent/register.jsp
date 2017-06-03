<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><body><center>
<h1>JLC TechSupport</h1>
<h2>Registration Form</h2>
<font color=red size=5>
<% Object obj=request.getAttribute("MSG");
if(obj!=null){
	out.print(obj);
}
%>
</font>
<form action="register.jlc" method="post">
<table>
<tr><td>Full name</td>
<td><input type="text" name="fname"/></td></tr>
<tr><td>Email Id</td>
<td><input type="text" name="email"/></td></tr>
<tr><td>Phone</td>
<td><input type="text" name="phone"/></td></tr>
<tr><td>Username</td>
<td><input type="text" name="username"/></td></tr>
<tr><td>Password</td>
<td><input type="password" name="password"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value=" Register "/></td></tr>
</table>
</form></center></body></html>