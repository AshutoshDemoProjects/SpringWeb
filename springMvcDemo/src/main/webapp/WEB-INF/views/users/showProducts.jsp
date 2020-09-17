<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<jsp:include page="../links.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<div class="container">
		<div class="jumbotron">
		<div class="row">
			<c:forEach var="product" items="${products}">
				<div class="card m-1" style="width: 18rem;">
					<img src="${product.url}" class="card-img-top" alt="${product.prodName}">
					<div class="card-body">
						<h5 class="card-title">${product.prodName}</h5>
						<p class="card-text">PorductId:${product.prodName}<br>Company:${product.company}<br>Price:${product.price}</p>
						<a href="#" class="btn btn-primary"><i class="fas fa-shopping-cart"></i> Add To Cart</a>
					</div>
				</div>
			</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>