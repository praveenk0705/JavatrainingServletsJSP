<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:view>

<html>
<body><center>
<h2>Shubham Learning Center</h2>
<h:panelGrid columns="2">

<h:outputText value="First Name"/>
<h:outputText value="#{studentBean.firstName}"/>

<h:outputText value="Email"/>
<h:outputText value="#{studentBean.email}"/>

<h:outputText value="Age"/>
<h:outputText value="#{studentBean.age}"/>

<h:outputText value="Balance"/>
<h:outputText value="#{studentBean.balance}"/>

</h:panelGrid>
</center></body>
</html>

</f:view>