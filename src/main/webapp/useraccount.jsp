<%@page import="com.customer.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "table.css" />
<meta charset="ISO-8859-1">
<title>My Profile</title>
</head>
<body>

  
    <%
		Customer cus = (Customer) request.getAttribute("cuslog");
	%>
    
    
	<div>
     
  			
		</div>
    <p class="sign" align="left">My Profile</p>
     
     <table>
     
     <tr>
			<th>ID</th>
			<th> <input  class="ud" type="text" name="id" disabled="disabled" value="<%=cus.getId()%>" /> </th>
	</tr>
     
     <tr>
			<th>Name</th>
			<th> <input  class="ud" type="text" name="name" disabled="disabled" value="<%=cus.getName()%>" /> </th>
	</tr>
    <tr>
    		<th> Address </th>   
    		<th><input class="ud" type="text" name="address" disabled="disabled" value="<%=cus.getAddress()%>" /> </th>
	</tr>	
	<tr>
			<th> Phone Number </th>
    	    <th><input class="ud" type="text" name="phone" disabled="disabled" value="<%=cus.getPhone()%>" /> </th>
	</tr>
	<tr>
	         <th> User Name </th>
			  <th>  <input class="ud" type="text" name="username" disabled="disabled" value="<%=cus.getUsername()%>" /> </th>
	</tr>
	<tr>
			<th>Email</th>
			<th> <input  class="ud" type="text" name="email" disabled="disabled" value="<%=cus.getEmail()%>" /> </th>
	</tr>
	
 </table>
 
 
 
 
 

</body>
</html>
	