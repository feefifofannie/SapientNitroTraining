<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.errMsg{
	color : red;
}
</style>
</head>
<body>
<form:form method="POST" commandName="customer" action="/SpringValidation/customer/signup">
	<table>
		<tr>
			<td><form:label path="name">Customer Name</form:label></td>
			<td><form:input path="name"/></td>
			<td><form:errors path="name" cssClass="errMsg"/></td>
		</tr>
		<tr>
			<td><form:label path="age">Age</form:label></td>
			<td><form:input path="age"/></td>
			<td><form:errors path="age" cssClass="errMsg"/></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit"/></td>
		</tr>
	</table>
</form:form>
</body>
</html>