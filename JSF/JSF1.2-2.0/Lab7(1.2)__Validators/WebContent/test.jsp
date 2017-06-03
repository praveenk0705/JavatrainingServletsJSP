<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>

<html><body><center>
<h2>Shubham Learning Center</h2>
<h:form>

<h:panelGrid id="loginGrid" columns="3">
<h:outputText value="Full Name"/>
<h:inputText id="fname" value="#{studentBean.firstName}" 
			 required="true" label="Full Name">
<f:validateLength minimum="4"/>
</h:inputText>
<h:message for="fname" style="color:red;font-size:15px"/>

<h:outputText value="Email"/>
<h:inputText id="email" value="#{studentBean.email}" 
			 required="true" label="Email ID">
<f:validateLength minimum="6"/>
<f:validator validatorId="shuemail"/>			 
</h:inputText>
<h:message for="email" style="color:red;font-size:15px"/>

<h:outputText value="Age"/>
<h:inputText id="age" value="#{studentBean.age}"
			 required="true" label="Age">
<f:validateLongRange minimum="20" maximum="30"/>
</h:inputText>
<h:message for="age" style="color:red;font-size:15px"/>

<h:outputText value="Balance"/>
<h:inputText id="bal" value="#{studentBean.balance}"
			 required="true" label="Balance">
<f:validateDoubleRange minimum="900.00" maximum="5000.00"/>
</h:inputText>
<h:message for="bal" style="color:red;font-size:15px"/>

<h:outputText value="SHU Username"/>
<h:inputText id="uname" value="#{studentBean.username}"
			 required="true" label="Username">
<f:validateLength minimum="5" maximum="9"/>
<f:validator validatorId="shuun"/>
</h:inputText>
<h:message for="uname" style="color:red;font-size:15px"/>

<h:outputText value="SHU Password"/>
<h:inputSecret id="pswd" value="#{studentBean.password}"
			 required="true" label="Password">
<f:validateLength minimum="5" maximum="9" />
</h:inputSecret>
<h:message for="pswd" style="color:red;font-size:15px"/>

<center><h:commandButton value="Submit"  action="#{studentBean.show}"/></center>
</h:panelGrid>

</h:form>
</center></body></html>
</f:view>