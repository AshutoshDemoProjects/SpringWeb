<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Users</title>
<jsp:include page="../links.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<div class="container">
		<div class="jumbotron">
			<h2>All Users</h2>
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th>User Id</th>
						<th>User Name</th>
						<th>Contact</th>
						<th>Roll</th>
						<th>edit/delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${users}">
						<tr>
							<td>${user.userId}</td>
							<td>${user.userName}</td>
							<td>${user.contact}</td>
							<td>${user.roll}</td>
							<td><a href="<%=request.getContextPath()%>/admin/editUser/${user.userId}"><i class="far fa-edit"></i></a>/<a href="<%=request.getContextPath()%>/admin/deleteUser/${user.userId}"><i class="far fa-trash-alt"></i></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="link2">click here</a>
		</div>
	</div>
</body>
</html>