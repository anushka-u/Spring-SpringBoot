<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<thead>
		<tr>
			<th> BOOK ID </th>
			<th> BOOK NAME </th>
			<th> BOOK PRICE </th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items= "${books}" var="book">
			<tr>
				<td>${book.bookId }</td>
				<td>${book.bookName }</td>
				<td>${book.bookPrice }</td>
		</c:forEach>
		
	</tbody>
</body>
</html>