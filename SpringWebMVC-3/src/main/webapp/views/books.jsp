<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Book Price</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.bookid}</td>
				<td>${book.bookname}</td>
				<td>${book.bookprice}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>