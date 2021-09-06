<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Page</title>
</head>
<body>
	<form action="./addemployee" method="get">
		EmployeeId:<input type="text" name="empid" placeholder="Enter Id"><br>
		EmployeeName:<input type="text" name="empname" placeholder="Enter Name"><br>
		Password:<input type="password" name="passkey" placeholder="Enter password">
		<input type="submit" value="SignUp">
	</form>
</body>
</html>