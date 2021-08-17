<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Register For Shifalari</title>
        <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="insert1.css">
    </head>
    <body>
	
	<h1><a href="http://designvkp.com/create-responsive-forms-using-html-css/" rel="dofollow" target="_blank">Create Responsive HTML CSS Form</a></h1>

      <form action="insert" method="post">
      
        <h1>Register New User</h1>
        
        <fieldset>
          
          
          <label for="name"><b>Name</b></label><br>
    	<input type="text" placeholder="Enter your name" name="name" required><br>
    
    
    	<label for="email"><b>Email</b></label><br>
    	<input type="email" placeholder="Enter E-Mail" name="email" required><br>

    	<label for="address"><b>Address</b></label><br>
    	<input type="text" placeholder="Enter Address" name="address" required ><br>

    	<label for="phone"><b>PhoneNumber</b></label><br>
    	<input type="text" placeholder="Enter Phone Number" name="phone" required><br>
    
    	<label for="username"><b>UserName</b></label><br>
    	<input type="text" placeholder="Enter User Name" name="username" required><br>
    
    	<label for="psw"><b>Password</b></label><br>
    	<input type="password" placeholder="Enter Password" name="psw" required><br>
          
        </fieldset>
        
       
        <button type="submit">Submit</button>
      </form>
      
    </body>
</html>

