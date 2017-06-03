<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
     <%@taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
     <%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jlc" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<center>
<h1>Java Learning Center</h1>
<h2 align="right"></h2>
<logic:present name="DELETED">
<table width="100%" bgcolor="yellow">
<tr><td align="center">
<font color="green" size="6">
<b>${DELETED}</b>
</font>
</td></tr>
</table>
</logic:present>
<logic:present name="NOT_FOUND">
<table width="100%" bgcolor="lightgreen">
<tr>
<td align="center"><font color="red" size="6"><b>
${NOT_FOUND }</b></font></td></tr>
</table>
</logic:present>
<logic:notPresent name="NOT_FOUND">
<table style="font-size:20;border-style:dottend;border-size:1px;border-color:red" width="100%">
<tr>
<td colspan="8" align="right">${BEGIN } TO ${END } of ${TNOR }</td>
</tr>
<tr><td align="center">Contact ID</td>
<td align="center">First Name</td>
<td align="center">Last Name</td>
<td align="center">Email Id</td>
<td align="center">Phone</td>
<td align="center">Status</td></tr>
<logic:iterate id="cto" name="CLIST" scope="session" type="com.jlcindia.struts1.ContactTO">

<tr>
<logic:equal name="CID" value="${cto.contactId}">
<logic:equal name="EDIT" value="TRUE">
<html:form action="/UpdateContactSubmit.do?m=updateContact">
<td><bean:write name="cto" property="contactId"/></td>
<html:hidden property="contactId" value="${cto.contactId }"/>
<td><html:text property="fname" value="${cto.fname }"/></td>
<td><html:text property="lname" value="${cto.lname}"/></td>
<td><html:text property="email" value="${cto.email }"/></td>
<td><html:text property="phone" value="${cto.phone }"/></td>
<td><html:select property="status" value="${cto.status }">
<html:option value="Enabled">Enabled</html:option>
<html:option value="Disabled">Disabled</html:option>
</html:select>
</td>
<td>
<html:submit value="Save"/></td>
</html:form>
</logic:equal>
<logic:equal name="EDIT" value="FALSE">
<td>
<html:form action="/ContactEditSubmit.do?method=editContact">
<html:hidden property="cid" value="${cto.contactId }"/>
<html:submit value="Edit"/>
</html:form></td>
</logic:equal>
<td></td>
<html:form action="/ContactDeleteSubmit.do?method=deleteContact">
<html:hidden property="cid" value="${cto.contactId }"/>
<html:submit value="Delete"/>
</html:form>
</logic:equal>
<logic:notEqual name="CID" value="${cto.contactId }">
<td><bean:write name="cto" property="contactId"/></td>
<td><bean:write name="cto" property="fname"/></td>
<td><bean:write name="cto" property="lname"/></td>
<td><bean:write name="cto" property="email"/></td>
<td><bean:write name="cto" property="phone"/></td>
<td><bean:write name="cto" property="status"/></td>
<logic:equal name="EDIT" value="FALSE">
<td>
<html:form action="/ContactEditSubmit.do?method=editContact">
<html:hidden property="cid" value="${cto.contactId }"/>
<html:submit value="Edit"/>
</html:form>
</td>
</logic:equal>
<logic:equal name="EDIT" value="TRUE">
<td><html:form action="/UpdateContactSubmit.do?method=updateContact">
<html:submit value="Save"/>
</html:form></td>
</logic:equal>
<td>
<html:form action="/ContactDeleteSubmit.do?method=deleteConatact">
<html:hidden property="cid" value="${cto.contactId }"/>
<html:submit value="Delete"/>
</html:form></td>
</logic:notEqual>
</tr>
</logic:iterate>
<tr>
<td colspan="4" align="left">
<logic:present name="SHOW_PREVIOUS">
<html:link forward="showpreviouscontacts">
<b>Previous</b>
</html:link>
</logic:present>
</td>
<td colspan="4" align="right">
<logic:present name="SHOW_NEXT">
<html:link forward="shownextcontacts">
<b>Next</b>
</html:link>
</logic:present></td></tr>
</table>
</logic:notPresent>
</center>
</body>
</html>