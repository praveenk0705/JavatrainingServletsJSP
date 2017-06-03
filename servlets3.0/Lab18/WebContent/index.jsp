<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><body>
<%
application.setAttribute("email", "sri@jlc.com");
out.println(application.getAttribute("email"));
application.setAttribute("email", "vas@jlc.com");
out.println(application.getAttribute("email"));
application.removeAttribute("email");
out.println(application.getAttribute("email"));
%>
</body>
</html>