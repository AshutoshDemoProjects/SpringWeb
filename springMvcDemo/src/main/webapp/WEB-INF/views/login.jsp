<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SingUp</title>
<jsp:include page="links.jsp"></jsp:include>
</head>
<body>
		<jsp:include page="menu.jsp"></jsp:include>
	<div class="container">
		<div class="jumbotron">
			<c:if test="${not empty msg}">
				<div class="alert alert-warning alert-dismissible fade show"
					role="alert">
					<strong>Error!</strong> ${msg}
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
			</c:if>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title text-center">SignUp</h5>
							<hr>
							<form:form action="validate" method="post">
								<div class="form-group">
									<form:label class="col-form-lable" path="userName">User Name</form:label>
									<form:input type="text" class="form-control" path="userName"></form:input>
								</div>
								<div class="form-group">
									<form:label class="col-form-lable" path="pass">Password</form:label>
									<form:input type="password" class="form-control" path="pass"></form:input>
								</div>
								<button type="submit" class="btn btn-primary btn-ln">SingIn</button>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>