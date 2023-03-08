<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LinkedList</title>
</head>
<body>
	<h1>LinkedList Operation</h1>
	<form action="LinkedListServlets" method="post">
		<input type="hidden" name="action" value="addFirst"> <input
			type="number" name="item" required="required">
		<button type="submit">addFirst</button>

	</form>
	<br>
	<form action="LinkedListServlets" method="post">
		<input type="hidden" name="action" value="addLast"> <input
			type="number" name="item" required="required">
		<button type="submit">addLast</button>
	</form>
	<br>

	<form action="LinkedListServlets" method="post">
		<input type="submit" name="action" value="deleteFirst">

	</form>
	<br>
	<form action="LinkedListServlets" method="post">
		<input type="submit" name="action" value="deleteLast">

	</form>
	<br>
	<form action="LinkedListServlets" method="post">
		<input type="submit" name="action" value="printList">
	</form>
	<br>
	<form action="LinkedListServlets" method="post">
		<input type="submit" name="action" value="getSize">
	</form>
	<%
	session.getAttribute("item");
	%>
</body>
</html>