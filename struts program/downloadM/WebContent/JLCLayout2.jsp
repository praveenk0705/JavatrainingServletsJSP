<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JLCLayout2</title>
</head>
<body>
<table width="90%" height="90%">
<tr height="10%">
<td colspan="3" bgcolor="red" align="center">
<tiles:insert attribute="HEADER"/>
</td>
</tr>
<tr height="80%">
<td width="20%" bgcolor="#c3d599" align="left">
<tiles:insert attribute="LMENU"/>
</td>
<td width="65%" bgcolor="c3d599" align="center">
<tiles:insert attribute="BODY"/>
</td>
</tr>
<tr height="10%" >
<td colspan="3" bgcolor="red" align="center">
<tiles:insert attribute="FOOTER"/>
</td>
</tr>
</table>
</body>
</html>