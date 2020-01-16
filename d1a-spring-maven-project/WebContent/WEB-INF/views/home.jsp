<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Home.
<P>The message from the Server ${message}.</p>

	<form action="user" method="post">
		<input type="text" name="userName"><br> <input
			type="submit" value="Login">
			</form>
</body>
</html>