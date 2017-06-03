<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %> 
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sk" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="brown">
<h1><html:errors/></h1>
<html:form action="/SearchSubmit">
<table heigh="30%" border="1" bgcolor="cyan">
<tr>
<td>Please Enter Sid:</td>
<td><html:text property="sid"/></td>
<td><html:errors property="sid" /></td> 
</tr>
</table>
<html:submit/>

</html:form>
<logic:present name="STO" scope="request" >
<table bgcolor="purple" border="2">
<tr>
<td><font color="black">sid:</font></td>
<td><font color="black">bid</font></td>
<td><font color="black">name:</font></td>
<td><font color="black">email:</font></td>
<td><font color="black">phone:</font></td>
</tr>
     <logic:iterate id="abc" name="STO"> 
<%--<sk:forEach var="abc" items="${STO }">--%>
<tr>
<td>
${abc.sid }</td>
<td>
${abc.bid }</td>
<td>
${abc.name }</td>
<td>
${abc.email }</td>
<td>

${abc.phone }</td>
</tr>
<%-- </sk:forEach> --%>
 </logic:iterate> 
</table>

</logic:present>

</body>
</html>