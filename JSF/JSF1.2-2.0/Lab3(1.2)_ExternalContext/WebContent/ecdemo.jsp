<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
	<html>
<body>
	<center>
		<br />
		<h1>
			<h:outputText value="#{ecdemoBean.str}" />
		</h1>
		<h:form>
			<h:commandButton value="Click Here" action="#{ecdemoBean.show}" />
		</h:form>
	</center>
</body>
	</html>
</f:view>