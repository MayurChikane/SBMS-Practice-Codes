<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Book Data</h2>
	Book ID : ${book.bookid}<br>
	Book Name : ${book.bookname}<br>
	Book Price : ${book.bookprice}
	<table border="1">
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Book Price</th>
		</tr>
		<tr>
			<th>${book.bookid}</th>
			<th>${book.bookname}</th>
			<th>${book.bookprice}</th>
		</tr>
	</table>
</body>
</html>