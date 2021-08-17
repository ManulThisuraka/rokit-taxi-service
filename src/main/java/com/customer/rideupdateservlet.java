package com.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/rideupdateservlet")
public class rideupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rideid = Integer.parseInt(request.getParameter("rideid"));
		String location = request.getParameter("location");
		String type = request.getParameter("type");
		String customerid = request.getParameter("cusid");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		boolean isTrue;
		
		isTrue = rideDButil.updateride(rideid, location, type, customerid);
		
		if(isTrue == true) {
			out.println("<script type ='text/javascript'>");
			out.println("alert( 'update successful!')");
			out.println("location ='UpdateRideById.jsp'");
			out.println("</script>");
		
			
		}
		else {
		
			out.println("<script type ='text/javascript'>");
			out.println("alert( 'illegal user!')");
			out.println("location ='UpdateRideById.jsp'");
			out.println("</script>");
		}
	}

}



