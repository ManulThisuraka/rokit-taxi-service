<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel = "stylesheet" type = "text/css" href = "table.css" />
	<title>Ride Details</title>
	
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

	<table border="1">
	<c:forEach var="ride" items="${rideDetailsU}">
	
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
	
	<c:url value="updateride.jsp" var="rideupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="location" value="${location}"/>
		<c:param name="type" value="${type}"/>
		<c:param name="customerid" value="${customerid}"/>
	</c:url>
	
	<a href="${rideupdate}">
	<input type="button" name="update" value="Update my ride details">
	</a>
	
	<br>
	<c:url value="deleteride.jsp" var="ridedelete">
		<c:param name="id" value="${id}" />
		<c:param name="location" value="${location}" />
		<c:param name="type" value="${type}" />
		<c:param name="customerid" value="${customerid}" />
	</c:url>
	<a href="${ridedelete}">
	<input type="button" name="delete" value="Cancel my ride">
	</a>
	

	
	
	
	
	
</body>
</html>