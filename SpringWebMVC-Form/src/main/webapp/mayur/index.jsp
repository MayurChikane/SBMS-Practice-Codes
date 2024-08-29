<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="product" modelAttribute="product" method="POST">
	<table>
	<tr>
		<td>Product Id</td>
		<td><form:input path="prodId"/> </td>
	</tr>
	
	<tr>
		<td>Product Name</td>
		<td><form:input path="prodName"/> </td>
	</tr>
	
	<tr>
		<td>Product Price</td>
		<td><form:input path="prodPrice"/> </td>
	</tr>
	
	<tr>
		<td><input type="submit" value="Submit"> </td>
	</tr>
	</table>
</form:form>
</body>
</html>