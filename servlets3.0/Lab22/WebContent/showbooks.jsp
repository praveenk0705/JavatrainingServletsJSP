<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.jlcindia.to.BookTo,java.util.List" %>
<html><body>
<h1>JLC Bookstore</h1>
<h3>Books available in Bookstore</h3>
<%
Object obj1=request.getAttribute("MSG");
if(obj1!=null){
	String msg=obj1.toString();
	out.println("<h1>"+msg+"</h1>");
}
Object obj2=session.getAttribute("BOOKS");
List<BookTo> books;
if(obj2!=null){
	%>
	<table>
	<tr><td>SNO</td>
	<td>BID</td>
	<td>Bname</td>
	<td>Author</td>
	<td>Cost</td>
	<td>Cat</td>
	<td>Pub</td>
	<td>ISBN</td></tr>
	<%
	books=(List<BookTo>)obj2;
	int c=1;
	for(BookTo bto:books){
	%>
	<tr>
	<td><%= c++ %></td>
	<td><%= bto.getBid() %></td>
	<td><%= bto.getBname() %></td>
	<td><%= bto.getAuthor() %></td>
	<td><%= bto.getCost() %></td>
	<td><%= bto.getCat() %></td>
	<td><%= bto.getPub() %></td>
	<td><%= bto.getIsbn() %></td>
	</tr>
	<%	
	}	
}
%>
</table></body></html>