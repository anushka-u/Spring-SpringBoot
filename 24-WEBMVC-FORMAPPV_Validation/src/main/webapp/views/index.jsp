<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color:red
}
</style>
</head>
<body>
	<h2>USER REGISTRATION FORM</h2>
	<form:form action="register" modelAttribute="user" method="POST">
	<table>
		<tr>
			<td>User Name</td>
			<td><form:input path="userName"/></td>
			<form:errors path="userName" cssClass="error"/>
		</tr>
		<tr>
			<td>Password</td>
			<td><form:input path="password"/><form:errors path="password" cssClass="error"/></td>
			
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email"/><form:errors path="email" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td><form:input path="phNumber"/><form:errors path="phNumber" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><form:input path="age"/><form:errors path="age" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Submit</td>
			<td><input type="submit" value ="Register"/></td>
		</tr>
	</table>
	</form:form>
</body>
</html>