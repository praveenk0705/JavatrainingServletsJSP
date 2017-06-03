<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:view>

<html><body><center>
<h2>Shubham Learning Center</h2>
<h3>Managed Bean Demo</h3>
<h:form>

<h:panelGrid columns="3">
<h:outputText value="First Name" />
<h:inputText id="fname" required="true" value="#{studentBean.firstname}"/>
<h:message for="fname"/>
<h:outputText value="Last Name"/>
<h:inputText id="lname" required="true" value="#{studentBean.lastname}"/>
<h:message for="lname"/>
<h:commandButton value="Show" action="#{studentBean.show}"/>
</h:panelGrid>

</h:form>
</center></body></html>

</f:view>