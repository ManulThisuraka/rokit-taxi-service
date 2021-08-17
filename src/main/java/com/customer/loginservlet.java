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
import javax.servlet.http.HttpSession;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isTrue;
		
		Customer cuslog = new Customer();
		cuslog.setUsername(userName);
		
		isTrue = customerDButil.validate(userName, password);
		
		if (isTrue == true) {
			List<Customer> cusDetails = customerDButil.getCustomer(userName);
			request.setAttribute("cusDetails", cusDetails);
			
			HttpSession session = request.getSession(false);
			session.setAttribute("username", userName);
			
			RequestDispatcher dis = request.getRequestDispatcher("customerpanel.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='customerlogin.jsp'");
			out.println("</script>");
		}
		
	}

}
