<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee</title>
</head>

<body>
<h3>Employee Names</h3>
<c:forEach  var="a" items="${myEmploeeDetails}">
<c:out value="${a.empname}"/><br>
</c:forEach>

</body>
</html>