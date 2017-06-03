<%@ page import="java.util.List" %>
<html><body>
<h1>JLC Bookstore</h1>
<h3>Books available in Bookstore</h3>
<%
Object obj1=request.getAttribute("MSG");
if(obj1!=null){
	String msg=obj1.toString();
	out.println("<h1>"+msg+"</h1>");
}
else{
%>
<h1>
<form action="showcart.jlc">
<input type="submit" value="Show My Cart"/>
</form></h1>
<table>
<%
Object obj2=session.getAttribute("BOOKS");
List<String> books;
if(obj2!=null){
	books=(List<String>)obj2;
	int c=1;
	for(String bn:books){
		%>
		<tr>
		<td><%= c++ %></td>
		<td><%= bn %></td>
		<td>
		<form action="viewdetails.jlc">
		<input type="hidden" name="bname" value="<%= bn %>"/>
		<input type="submit" value="View Details"/>
		</form>
		</td>
		<td>
		<form action="addcart.jlc">
		<input type="hidden" name="bname" value="<%= bn %>"/>
		<input type="submit" value="Add to Cart"/>
		</form>
		</td>
		</tr>
		<%
	}
}
}
%>
</table>
<h1>
<form action="showcart.jlc">
<input type="submit" value="Show My Cart"/>
</form></h1>
</body></html>