<html><body><center>
<h1>Java Learning Center</h1>
Email from Rrequest:<%= request.getAttribute("EM") %><br/>
Email from Session:<%= session.getAttribute("EM") %><br/>
Email from Context:<%= application.getAttribute("EM") %><br/>
</center></body></html>