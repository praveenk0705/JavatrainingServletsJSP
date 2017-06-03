<%@ page import="java.util.List" %>
<html><body>
<h1>JLC Bookstore</h1>
<h3>Details of selected Book</h3>
<h1> BookName:<% out.println(request.getAttribute("BN")); %><br/>
Author:<%= request.getAttribute("AU") %><br/>
Publications:<%= request.getAttribute("PUB") %><br/>
Cost:<%= request.getAttribute("COST") %><br/></h1>
<h1><a href="showbooks.jsp">Continue Shopping...</a></h1>
</body>
</html>