<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><body><center>
<h1>Java Learning Center</h1>
<h1>This is the JLC home</h1>
<%
String url1="hai.jsp";
String url2=response.encodeURL("hello.jsp");
String url3=response.encodeURL("hellohai.jsp");
System.out.println(url1);
System.out.println(url2);
System.out.println(url3);
%>
<h1>
<a href="<%= url1 %>">Click here to Hai</a><br/>
<a href="<%= url2 %>">Click here to Hello</a><br/>
<a href="<%= url3 %>">Click here to HelloHai</a><br/>
</h1>
<hr>
<form action="demo.jlc" method="post">
<table>
<tr><td>Email</td>
<td><input type="text" name="email"/></td>
<td><input type="hidden" name="jsessionid" value="<%= session.getId() %>"/></td></tr> 
<tr><td colspan="2" align="center"><input type="submit" value="Submit"/></td></tr>
</table></form>
</center></body></html>