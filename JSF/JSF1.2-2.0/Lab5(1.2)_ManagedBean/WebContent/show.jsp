<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:view>
<html>
<body><center>

<h2>Shubham Learning Center</h2>
<h:panelGrid id="showId" columns="2">

<h:outputText value="First Name"/>
<h:outputText value="#{studentBean.firstname }"/>
<h:outputText value="Last Name"/>
<h:outputText value="#{studentBean.lastname }"/>

<h:outputText value="Email"/>
<h:outputText value="#{studentBean.email}"/>
<h:outputText value="Phone"/>
<h:outputText value="#{studentBean.phone}"/>

<h:outputText value="DOB"/>
<h:outputText value="#{studentBean.dob }"/> 
<h:outputText value="Fee"/>
<h:outputText value="#{studentBean.fee }"/> 
<h:outputText value="Age"/>
<h:outputText value="#{studentBean.age }"/> 

<h:outputText value="Courses"/>
<h:dataTable value="#{studentBean.courses}" var="cou" 
			 border="1"	bgcolor="#ddcc00">
<h:column><h:outputText value="#{cou}"/></h:column>			 
</h:dataTable>
<h:outputText value="References"/>
<h:outputText value="#{studentBean.refs}"/>

<h:outputText value="City"/>
<h:outputText value="#{studentBean.address.city}"/>
<h:outputText value="State"/>
<h:outputText value="#{studentBean.address.state}"/>

<h:outputText value="Course Name"/>
<h:outputText value="#{studentBean.course.cname}"/>
<h:outputText value="Cost"/>
<h:outputText value="#{studentBean.course.cost}"/>
</h:panelGrid>
</center></body>
</html>
</f:view>