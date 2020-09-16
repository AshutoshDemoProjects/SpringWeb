<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Spring5 MVC Hibernate Demo</title>
        <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
 <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.min.js"></script>        
 <script type="text/javascript" src="webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Input Form</h1>
        <form:form action="addUser" method="post" modelAttribute="user">
            <table>
                <tr>
                    <td>Name</td>
                    <td>
                        <form:input path="name" /> <br />
                        <form:errors path="name" cssClass="error" />
                    </td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>
                        <form:input path="email" /> <br />
                        <form:errors path="email" cssClass="error" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><button type="submit">Submit</button></td>
                </tr>
            </table>
        </form:form>
         
        <h2>Users List</h2>
        <table class="table">
            <tr>
                <td><strong>Name</strong></td>
                <td><strong>Email</strong></td>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>


<!-- 
src
|
|-main
	|
	|-java
	|-reso
|
|-test
	|
	|-java
	|-reso






 -->






