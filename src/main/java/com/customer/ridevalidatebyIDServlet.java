package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ridevalidatebyIDServlet")
public class ridevalidatebyIDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int rideid =Integer.parseInt(request.getParameter("rideid"));
		
		
		List<ride> rideDetailsU =rideDButil.ValidateRideId(rideid);
		request.setAttribute("rideDetailsU", rideDetailsU);
		RequestDispatcher dis =request.getRequestDispatcher("printRideDetails.jsp");
		dis.forward(request, response);
		
		
		
	}

}
