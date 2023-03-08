<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stack</title>
</head>
<body>
	<h1>Stack Operation</h1>
	<form action="StackServlets" method="post">
		<input type="hidden" name="action" value="push"> <input
			type="number" name="item" required="required">
		<button type="submit">Push to stack</button>
		
	</form>
	<br>
	<form action="StackServlets" method="post">
		<input type="submit" name="action" value="peek">
	</form>
	<br>

	<form action="StackServlets" method="post">
		<input type="submit" name="action" value="pop">
	</form>
	<br>

	<form action="StackServlets" method="post">
		<input type="submit" name="action" value="show">
	</form>
	<%
	session.getAttribute("item");
	
	%>
</body>
</html>