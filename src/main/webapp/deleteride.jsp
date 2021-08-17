<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel = "stylesheet"
   type = "text/css"
   href = "table.css" />
		
</head>
<body>

	<%
		int id = Integer.parseInt(request.getParameter("id"));
		String location = request.getParameter("location");
		String type = request.getParameter("type");
		String customerid = request.getParameter("customerid");
	%>
	
	<h2> Requested ride cancel</h2>
	<form action="deleteRide" method="post">
	<table>
		<tr>
			<td>Ride ID</td>
			<td><input type="text" name="rideid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Destination</td>
			<td><input type="text" name="location" value="<%= location %>" readonly></td>
		</tr>
		<tr>
		<td>Vehicle Type</td>
		<td><input type="text" name="type" value="<%= type %>" readonly></td>
	</tr>
	<tr>
		<td>Customer ID</td>
		<td><input type="text" name="cusid" value="<%= customerid %>" readonly></td>
	</tr>		
	</table>
	<br>
	<input type="submit" name="submit" value="Cancel requested ride">
	</form>

</body>
</html>