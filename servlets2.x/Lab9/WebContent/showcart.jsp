<%@ page import="java.util.List" %>
<html><body>
<h1>JLC Bookstore</h1>
<h3>Books selected</h3>
<table>
<%
Object obj=request.getAttribute("CART");
List<String> cart;
if(obj!=null){
	cart=(List<String>)obj;
	int c=1;
	for(String bn:cart){
		%>
		<tr>
		<td><%= c++ %></td>
		<td><%= bn %></td>
		<td>
		<form action="removecart.jlc">
		<input type="hidden" name="bname" value="<%= bn %>"/>
		<input type="submit" value="Remove from Cart"/>
		</form></td></tr>
		<%
	}
}
%>
</table>
<h1><a href="showbooks.jsp">Continue Shopping...</a></h1>
<h1><a href="placeorder.jsp">Place Order</a></h1>
</body>
</html>