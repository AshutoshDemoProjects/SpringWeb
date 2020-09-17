<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SingUp</title>
<jsp:include page="links.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<jsp:include page="menu.jsp"></jsp:include>
		<div class="jumbotron">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-8">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title text-center">SignUp</h5>
							<hr>
							<form:form action="addUser" method="post">
								<div class="form-group row">
									<form:label class="col-3 col-form-lable" path="userName">User Name</form:label>
									<div class="col-9">
										<form:input type="text" class="form-control" path="userName"></form:input>
									</div>
								</div>
								<div class="form-group row">
									<form:label class="col-3 col-form-lable" path="pass">Password</form:label>
									<div class="col-9">
										<form:input type="password" class="form-control" path="pass"></form:input>
									</div>
								</div>
								<div class="form-group row">
									<form:label class="col-3 col-form-lable" path="contact">Contact</form:label>
									<div class="col-9">
										<form:input type="text" class="form-control" path="contact"></form:input>
									</div>
								</div>
								<form:input path="roll" type="hidden" value="user"></form:input>
								<button type="submit" class="btn btn-primary">Submit</button>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>