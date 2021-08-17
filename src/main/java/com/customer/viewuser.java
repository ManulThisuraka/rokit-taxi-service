/*package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/viewuser")
public class viewuser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("cusid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		boolean isTrue;
		
		//Customer cuslog = new Customer();
		//cuslog.setUsername(userName);
		
		
		isTrue = customerDButil.validate(userName, password);
		
		if (isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='customerpanel.jsp'");
			out.println("</script>");
			
			
			
		} else {
			
			//HttpSession session = request.getSession(false);
			//session.setAttribute("username", userName);
			List<Customer> cusDetails = customerDButil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
			
			
		}
		
	}

}
*/


package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/viewuser")
public class viewuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String password = request.getParameter("password");
		Customer cuslog = customerDButil.getCustomerByPsw(password);
		
	
		request.setAttribute("cuslog", cuslog);
		
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/useraccount.jsp");
		dispatcher.forward(request, response);

		
		
	}

}

