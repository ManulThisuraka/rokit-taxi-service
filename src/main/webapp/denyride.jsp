<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "table.css" />
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}
	</style>
</head>
<body>

	<table>
	<c:forEach var="ride" items="${rideDetails}">
	
	<c:set var="id" value="${ride.id}"/>
	<c:set var="location" value="${ride.location}"/>
	<c:set var="type" value="${ride.type}"/>
	<c:set var="customerid" value="${ride.customerid}"/>
	
	
	<tr>
		<td>Ride ID</td>
		<td>${ride.id}</td>
	</tr>
	<tr>
		<td>Destination</td>
		<td>${ride.location}</td>
	</tr>
	<tr>
		<td>Requested vehicle type</td>
		<td>${ride.type}</td>
	</tr>
	<tr>
		<td>Customer ID</td>
		<td>${ride.customerid}</td>
	</tr>

	</c:forEach>
	</table>
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>