<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

<html>
<body>
<h:form>
<h2>Shubham Learning Center</h2>
<h4><i>Hi <h:outputText value="#{userBean.username }"/><br>
Your Login is Successful</i></h4>

<h5>This is Home Page</h5>

<h:commandButton value="Try again"  action="#{userBean.gotoLogin }"/>
</h:form>
</body>
</html>

</f:view>