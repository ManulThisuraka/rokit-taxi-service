package com.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class customerinsert
 */
@WebServlet("/customerinsert")
public class customerinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customerinsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("psw");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		boolean isTrue;
		isTrue = customerDButil.insertcustomer(name, email, address, phone, username, password);
		
		if (isTrue == true ) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Data has been saved sucessfully.');");
			out.println("location='customerinsert.jsp'");
			out.println("</script>");
			
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Data has not been saved');");
			out.println("location='customerinsert.jsp'");
			out.println("</script>");
		} 
		
	}

}

