<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adminmenu</title>
</head>
<body>
<h3>
<html:link forward="updatedload">Update Download</html:link><br>
<html:link forward="alldownload">Show All Download</html:link><br>
<html:link forward="adminhome">Upload File</html:link>
</h3>
</body>
</html>