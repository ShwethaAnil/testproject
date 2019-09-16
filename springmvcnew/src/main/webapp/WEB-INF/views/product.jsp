<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AllZon</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<table border="1">
	<tr>
		<th>ProductId</th>
		<th>Product Name</th>
		<th>Cost</th>
		<th>Quantity</th>
		<th>Brand</th>
	</tr>
	<c:forEach  items="${listproducts}"  var="p">
	<tr>
		<td>${p.pid}</td>
		<td>${p.pname}</td>
		<td>${p.cost}</td>
		<td>${p.qty}</td>
		<td>${p.brand}</td>
		<td>edit</td>
		<td>delete</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>