<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Queue Operation</h1>
	<form action="QueueServlets" method="post">
		<input type="hidden" name="action" value="add"> <input
			type="number" name="item" required="required">
		<button type="submit">add</button>
		
	</form>
	<br>
	<form action="QueueServlets" method="post">
		<input type="submit" name="action" value="remove">
	</form>
	<br>

	<form action="QueueServlets" method="post">
		<input type="submit" name="action" value="peek">
	</form>
	<%
	session.getAttribute("item");
	
	%>
	<br>
</body>
</html>