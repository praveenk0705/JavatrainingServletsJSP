<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
    <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><b>Absense Response Form</b></center>

<form name="responseForm" action="/New/responsed.do"  method="post" >
<table border="0" width=100%">

<tr>
    <th align="right">
  Name:
    </th>
    <td align="left">
        <input type="text" name="name" value=<%=request.getAttribute("Name") %>></input><br></br>
        </td>
        </tr>
        <tr>
    <th align="right">
  Phone :
    </th>
    <td align="left">
 <input type="text" name="phone" value=<%=request.getAttribute("Phone") %>></input><br></br>
</td>
</tr>

<tr>
    <th align="right">
  Email:
    </th>
    <td align="left">
<input type="text" name="email" value=<%=request.getAttribute("Email")%>></input><br></br>
</td>
</tr>

<tr>
    <th align="right">
  From:
    </th>
    <td align="left">
<input type="text" name="from" value=<%=request.getAttribute("From") %>></input><br>
</td>
</tr>
<tr>
    <th align="right">
  To:
    </th>
    <td align="left">
 <input type="text" name="to" value=<%=request.getAttribute("To") %>></input><br>
 </td>
 </tr>
 <tr>
    <th align="right">
  Type:
    </th>
    <td align="left">
<input type="text" name="type" value=<%=request.getAttribute("Type") %>></input><br>
</td>
</tr>
<tr>
    <th align="right">
  Hour:
    </th>
    <td align="left">
<input type="text" name="hour" value=<%=request.getAttribute("Hour") %>></input><br>
</td>
</tr>
<tr>
    <th align="right">
  Description:
    </th>
    <td align="left">
 <input type="text" name="description" value=<%=request.getAttribute("Description") %>></input><br>
 </td>
 </tr>
 <tr>
    <th align="right">
  Creation Time:
    </th>
    <td align="left">
 <input type="text" name="datetime" value=<%=request.getAttribute("Datetime") %>></input><br>
 </td>
 </tr>
<tr>
    <th align="right">
  Absense Request:
    </th>
    <td align="left"> 
 <input type="text" name="leave" value=<%=request.getAttribute("Leave") %>></input><br>
 </td>
 </tr>
 <tr>
    <th align="right">
  Comments:
    </th>
    <td align="left">
 <input type="text" name="comments" value=<%=request.getAttribute("Comments") %>></input><br>
 </td>
 </tr>
 <tr>
    <th align="right">
 
    </th>
    <td align="left">
<input type="submit" value="submit"/>
</td>
</tr>

</table>
</form>
</body>
</html>