<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>

<html>
<body>
<h2>Shubham Learning Center</h2>
<h2>Account Login</h2>

<h:outputText value="#{userBean.errMsg}" style="color:red;font-size=9"/>

<h:form>
<h:panelGrid id="loginPanel" columns="3">
<h:outputText value="Username"/>
<h:inputText id="uname" value="#{userBean.username}" required="true"/>
<h:message for="uname" style="color:red;font-size=9"/>
<h:outputText value="Password"/>
<h:inputSecret id="pword" value="#{userBean.password}" required="true"/>
<h:message for="pword" style="color:red;font-size=9"/>
<h:commandButton value="Login Now" action="#{userBean.verifyUser }"/>
</h:panelGrid>
</h:form>
</body>
</html>
</f:view>