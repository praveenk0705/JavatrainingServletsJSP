<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>JLC Struts2 Login Application</title>
<s:head/>
</head>
<body bgcolor="#FBBB">
<center><br><br>
<h1><font color="#0000ff">Account Login</font></h1>
<s:actionerror/>
<s:form action="annotatedLogin">
<s:textfield key="username"/>
<s:password key="password"/>
<s:submit/>
</s:form>
</center>
</body>
</html>
