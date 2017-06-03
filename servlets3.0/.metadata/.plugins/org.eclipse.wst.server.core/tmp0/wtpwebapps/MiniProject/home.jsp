<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><body><center>
<h1>JLC TechSupport</h1>
<font color=red size=5>Hi
<% Object obj=session.getAttribute("UN");
if(obj!=null){
	out.print(obj);
}
%>
</font>
<h2>This is the Home page</h2>
</center></body></html>