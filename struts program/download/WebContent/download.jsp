<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello Login List page
<table border="0">
<tr>
<td colspan="7">
<tr align="left">
<td>
<html:form action="/Download.do?method=downloadProfile">
<html:select property="downloadname">
<html:options property="downloadname" labelProperty="downloadname" collection="DLOAD"/>
</html:select>
<html:submit value="download"/>
</html:form>
</td>
<td>
</td>
</tr><hr>
</td>
</tr>
</table>
</body>
</html>