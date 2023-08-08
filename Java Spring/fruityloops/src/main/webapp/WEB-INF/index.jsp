<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="/css/main.css"> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
</head>
<body>

  <h1>Fruit List</h1>
    <ul>
        <c:forEach var="fruit" items="${fruits}">
            <li>${fruit.getName()} - $${fruit.getPrice()}</li>
        </c:forEach>
    </ul>
    
</body>
</html>