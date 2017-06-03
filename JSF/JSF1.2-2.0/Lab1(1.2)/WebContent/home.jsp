<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>

<html>
<body>
<h:form>
<h2>Shubham Learning Center</h2>
<h3>Hi <h:outputText value="#{userBean.username}"/><br/>
	Your Login is Successful</h3>

<h:commandButton value="Try Again" action="#{userBean.gotoLogin }"/>	
</h:form>	
</body>
</html>
</f:view>