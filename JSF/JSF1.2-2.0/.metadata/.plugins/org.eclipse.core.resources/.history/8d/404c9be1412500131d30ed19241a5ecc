<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>

<html>
<body><center>
<h2>Shubham Learning Center</h2>

<h:form>
<h:outputText value="Please Enter Student Information"/>
<h:panelGrid id="studentFeeInfo" columns="3" border="1" bgcolor="pink">

<h:outputText value="Batch Id"/> 
<h:inputText id="batchId" label="Btach ID" value="#{studentBean.bid}"
 			  required="true" size="25" style="color:blue;font-style:bold">			  			  
<f:converter converterId="bidconverter"/>
</h:inputText>
<h:message for="batchId" style="color:red;font-size=30;"/>

<h:outputText value="Student Id"/>
<h:inputText id="studentId" label="Student Id" value="#{studentBean.sid}"
			  required="true" size="25" style="color:blue;font-style:bold">
<f:converter converterId="sidconverter"/>
</h:inputText>
<h:message for="studentId" style="color:red;font-size=30;"/>

<h:outputText value="Fee Amount"/>
<h:inputText id="feeAmount" label="Fee Amount" value="#{studentBean.amount}"
			 required="true" size="25" style="color:blue;font-style:bold">
<f:validateDoubleRange minimum="5555.00" maximum="9999.00"/>
<f:convertNumber minFractionDigits="4" maxFractionDigits="6"/>
</h:inputText>
<h:message for="feeAmount" style="color:red;font-size=30;"/>

<h:outputText value="Payment date"/>
<h:inputText id="paymentDate" value="#{studentBean.paymentDate}" label="Payment date"
			 required="true" size="25" style="color:blue;font-style:bold">
<f:convertDateTime pattern="dd/MM/yyyy"/>			 
</h:inputText>
<h:message for="paymentDate" style="color:red;font-size=30;"/>
</h:panelGrid>
<center><h:commandButton id="submit" value="Add Fee" action="#{studentBean.register}"/></center>
</h:form>

</center></body>
</html>

</f:view>