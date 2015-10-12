<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix ="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Core Tags Example</title>
</head>
<body>
	<c:set var="j" value="4,3,2,1"/>
	<c:forEach items="${j}" var="item" begin="1" end="2">
	<c:out value="${item}" default="abc"/>
	</c:forEach>
	<br><br>
    <c:set var="test" value="JSTL Core Tags"></c:set>
    <c:out value="${test}"></c:out>
    <br>
    <c:out value="${product.name}" default="Not Available" escapeXml="true"></c:out>
    <br>
    <c:forEach items="${productList}" var="product" varStatus="status">
    	<c:out value="${product.name}" default="Not Available" escapeXml="false"></c:out>
  	</c:forEach>
  	<br>
  	<c:set var="weight" value="10.05"/>
	<c:out value="${weight}"/>
	<br>
	<c:if test="${weight > 0.0}">
         <c:out value="${weight}"/>
    </c:if> 
    <br><br>
    <c:set var="weight" value="10"/>
	<c:if test="${weight != null}">
	Weight of the product is ${weight * 0.453592} kgs. 
	</c:if> 
	<br><br>
	<c:choose>
        <c:when test="${weight == null}">
             Weight is not provided for this product.
        </c:when>
        <c:when test="${weight <= 0}">
             Incorrect weight. It can not be zero or negative.
        </c:when>
        <c:otherwise>
        	Weight of the product is <c:out value="${weight}"/> lbs.
        </c:otherwise>
             
    </c:choose>
    <br><br>
    <c:catch var="exception">
	<c:out value="${firstNumber/ secondNumber}"/> 
	</c:catch>
	<c:if test="${exception != null}">
	Exception thrown is <c:out value="${exception}"/> 
	</c:if>
	<br><br>
	<c:set var="price" value="12.0" scope="session"/>
	<c:out value="${price}"/>
	<c:remove var="price"/>
	<c:out value="${price}"/>
	<br><br>
	<c:import url="http://www.apekshit.com" var="tutorial" />
	<br><br>
	<c:forTokens delims="," items="25,50,75,100" var="number">
    	<c:out value="${number}" default="25"></c:out>
  	</c:forTokens>
	<br><br>
	<!--<c:url value="http://www.mystore.com" var="storeLink">
    	<c:param name="productId" value="20"></c:param>
 	</c:url>
 	<c:import url="${storeLink}"></c:import>-->
	<br><br>
	
	<c:redirect url="http://www.mystore.com"></c:redirect>
	<br><br>
</body>
</html>