<!DOCTYPE html>
<html>
<head>
<title>RoKit Taxi </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel = "stylesheet" type = "text/css" href = "insert1.css" />

</head>
<body>
  <form action="bookRide" method="post">
  

	<div class="container">
    	<h1>Request a ride</h1> 
    	<label for="location"><b>Enter your destination</b></label><br>
    	<input type="text" placeholder="Enter location" name="location"><br>
    	
    	<label for="type"><b>Enter your prefered vehicle type</b></label><br>
    	<input type="text" placeholder="Bike/ Tuk/ Zip" name="type" required><br>
    	
    	<label for="customerid"><b>Enter Customer ID</b></label><br>
    	<input type="text" placeholder="Enter Customer ID" name="customerid"><br>
      	
      	
      	
      	<label for="text"><b>Vehicle type</b></label><br>
    	
     	<button type="Submit" name="register">Request ride</button>
	</div>
	</form>
	
	<form action="UpdateRideById.jsp" method="post">
		<button type="Submit" name="register">Update Ride</button>
	</form>
	
	
	
</body>
</html>
