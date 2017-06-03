<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><body><center>
<h1>JLC TechSupport</h1>
<h2>Login Form</h2>
<font color=red size=5>
<% Object obj=request.getAttribute("MSG");
if(obj!=null){
	out.print(obj);
}
%>
</font>
<form action="login.jlc" method="post">
<table>
<tr><td>Username</td>
<td><input type="text" name="username"/></td></tr>
<tr><td>Password</td>
<td><input type="password" name="password"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Login"/></td></tr>
</table>
</form>
<h2><a href="register.jsp">New User Signup</a>
<a href="forgotpw.jsp">Forgot My Password</a></h2>
</center>
</body>
</html>