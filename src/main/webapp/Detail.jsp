<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="search" method="get">
	<label>Enter Id :-</label>
	<input type="text" name="q">
	<input type="submit" value="Google Search">
</form>

<h1 style="color: Green">Hello ${data}</h1>

</body>
</html>