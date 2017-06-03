<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Download</title>
</head>
<body>
<table width="75%" bgcolor="lightgreen">

<tr><td align="center">Id</td>
<td align="center">Download Name</td>
<td align="center">Status</td></tr>

<logic:iterate id="da" name="ALLDLOAD" type="com.jlc.beans.DownloadBean">
<logic:equal name="EDIT" value="FALSE">
<tr><td><bean:write name="da" property="id"/></td>
<td><bean:write name="da" property="downloadname"/></td>
<td><bean:write name="da" property="status"/></td></tr>
</logic:equal>

<logic:equal name="EDIT" value="TRUE">
<html:form action="/UpdateDownloadSubmit.do?method=updateDownload">
<tr><td><bean:write name="da" property="id"/></td>
<html:hidden property="id" value="${da.id}"/>
<td><html:text property="downloadname" value="${da.downloadname}"/></td>
<td><html:select property="status" value="${da.status}">
<html:option value="enable">Enabled</html:option>
<html:option value="disable">Disabled</html:option>
</html:select></td>
<td><html:submit value="Update" /></td>
</html:form>
</logic:equal>
</logic:iterate>
</table>
</body>
</html>