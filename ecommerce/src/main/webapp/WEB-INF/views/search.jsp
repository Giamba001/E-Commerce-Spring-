<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product for productline</title>
</head>
<body>

	<h1>Cerca prodotti per Product Line</h1>


	<form name="firstForm" method="get" action="/search/productline">
		<label>Product Line</label><br>
	    <input type="text" name="productline"/><br/><br/>
	    <input type="submit" value="Search" /><br>
	</form>
	
	<c:forEach var="product" items="${products}">
		Codice: <c:out value="${product.productcode}"></c:out>
		Nome : <c:out value="${product.productname}"></c:out>
		Price: <c:out value="${product.buyprice}"></c:out><br><br>
	</c:forEach>

</body>
</html>