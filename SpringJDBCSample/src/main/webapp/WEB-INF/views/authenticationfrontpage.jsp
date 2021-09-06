<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<form action="./logincredential" method="post">
		<input type="text" name="empname" placeholder="Enter user name"><br>
		<input type="password" name="passkey" placeholder="Enter password">
		<input type="submit" value="login">
	</form>
</body>
</html>