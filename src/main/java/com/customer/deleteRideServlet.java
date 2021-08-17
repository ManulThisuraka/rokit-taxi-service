package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/deleteRideServlet")
public class deleteRideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = request.getParameter("rideid");
		boolean isTrue;
		
		isTrue = rideDButil.deleteRide(id);
		
		if( isTrue == true ) {
			RequestDispatcher dis = request.getRequestDispatcher("requestride.jsp");
			dis.forward(request,response);
		}
		else {
			List<ride> rideDetails = rideDButil.getRide(id);
			request.setAttribute("rideDetails", rideDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("UpdateRideById.jsp");
			dis.forward(request, response);
			
			
		}
		
		
		
		
		
	}

}
