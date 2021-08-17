package com.customer;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bookride")
public class bookride extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public bookride() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String location = request.getParameter("location");
		String type = request.getParameter("type");
		String customerid = request.getParameter("customerid");
		
		
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		boolean isTrue;
		isTrue = customerDButil.bookride(location,type,customerid);
		
		
		
		if (isTrue == true ) {
			List<ride> rideDetails =rideDButil.getRide(customerid);
			request.setAttribute("rideDetails", rideDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data has been saved sucessfully.');");
			out.println("location='denyride.jsp'");
			out.println("</script>");
			
			RequestDispatcher dis =request.getRequestDispatcher("denyride.jsp");
			dis.forward(request, response);
			
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Data has not been saved');");
			out.println("location='requestride.jsp'");
			out.println("</script>");
		} 
		
	}

}

