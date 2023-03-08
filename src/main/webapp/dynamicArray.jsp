<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dynamic Array</title>
</head>
<body>
	<h1>Dynamic array Operation</h1>
	<form action="DynamicArrayServlets" method="post">
		<input type="hidden" name="action" value="add"> <input
			type="number" name="item" required="required">
		<button type="submit">add to array</button>

	</form>
	<br>
	<form action="DynamicArrayServlets" method="post">
		<input type="submit" name="action" value="remove">
	</form>
	<br>

	<form action="DynamicArrayServlets" method="post">
		<input type="hidden" name="action" value="get"> <label
			for="item">index</label> <input type="number" name="index"
			required="required">
		<button type="submit">get</button>
	</form>
	<br>

	<form action="DynamicArrayServlets" method="post">
		<input type="hidden" name="action" value="set"> <label
			for="index">index</label> <input type="number" name="index"
			required="required"> <label for="value">value</label> <input
			type="number" name="value" required="required">
		<button type="submit">set</button>
	</form>
	<br>
	<form action="DynamicArrayServlets" method="post">
		<input type="submit" name="action" value="display">
	</form>
	<%
	session.getAttribute("item");
	%>


</body>
</html>