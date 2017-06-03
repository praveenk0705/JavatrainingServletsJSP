<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" style="color:blue">
Hi, <bean:write name="UN" scope="request"/>

</div>
<div align="left" style="color:magenta">
Welcome to Everest....
</div>
</body>
</html>