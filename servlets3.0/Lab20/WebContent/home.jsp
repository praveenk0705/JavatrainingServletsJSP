<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
<html>
<head><title>This is Listener Test program</title>
</head>
<body><center>
<font color="red" size="6">My Book Site</font>
<p align="right">
<font color="" size="6">
Total User Visited: <%= application.getAttribute("TV") %></font>
<font color="" size="6">
Current Online User: <%= application.getAttribute("CO") %></font>
<br/>
</p>
<form action="logout.jlc" method="post">
<input type="submit" value="Logout"/>
</form>
<%
Object obj=application.getAttribute("Book");
if(obj!=null){
	ArrayList al=(ArrayList)obj;
	Iterator it=al.iterator();
	while(it.hasNext()){
		String bk=it.next().toString();
		out.println("<h1>"+bk+"</h1>");
	}
}
%>
</center>
</body></html>