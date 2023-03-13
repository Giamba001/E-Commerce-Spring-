<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista prodotti</title>
</head>
<body>

	<a href="/search">Accedi alla pagina di ricerca per product line</a>

	<h1>Benvenuto</h1>
	<c:forEach var="product" items="${products}">
		Codice: <c:out value="${product.productcode}"></c:out>
		Nome : <c:out value="${product.productname}"></c:out>
		Price: <c:out value="${product.buyprice}"></c:out><br><br>
	</c:forEach>
	
	
	
</body>
</html>