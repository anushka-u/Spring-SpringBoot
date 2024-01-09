<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fill Your Data Below--</h1>
<form:form action="user" modelAttribute="user" method="POST">
	<tr>
		<td>User ID</td>
		<td><form:input path="userId"/></td>
	</tr>
	<br>
	<tr>
		<td>User Name</td>
		<td><form:input path="userName"/></td>
	</tr>
	<br>
	<tr>
		<td>User Email</td>
		<td><form:input path="userEmail"/></td>
	</tr>
	<br>
	<tr>
		<td>Submit</td>
		<td><input type="submit" value = "submit"/></td>
	</tr>
</form:form>
</body>
</html>