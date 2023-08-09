<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   
 <div class="w-50 mx-auto mt-3">
		<h1>Here's Your Omikuji!</h1>
		<div class="border p-3 rounded bg-info">
			<p>
				In
				<c:out value="${year}" />
				years, you will live in
				<c:out value="${city}" />
				with
				<c:out value="${person}" />
				as your roommate,
				<c:out value="${hobby}" />
				for a living. The next time you see a 
				<c:out value="${livingThing}" />,
				you will have good luck. Also,
				<c:out value="${message}" />
			</p>
		</div>
		<a href="/omikuji">Go back</a>
	</div>
   
</body>
</html>