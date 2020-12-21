package com.itp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.service.CusService;

import oop.itp.model.Customer;

/**
 * Servlet implementation class CustomerInsert
 */
@WebServlet("/CustomerInsert")
public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		 

	 String Name=request.getParameter("Name");
	 String address=request.getParameter("Address");
	 int contantNum=Integer.parseInt(request.getParameter("contactNum"));
	 String NIC = request.getParameter("NIC");
	 String Email =request.getParameter("Email");
	 String PASSWORD = request.getParameter("PASSWORD");
	 String  retypePASSWORD=request.getParameter("retypePASSWORD");
	 
	 
	
	 Customer c=new Customer();
	 c.setName(Name);
     c.setAddress(address);	
     c.setContactNum(contantNum);
     c.setNIC(NIC);
     c.setEmail(Email);
     c.setPASSWORD(PASSWORD);
     c.setRetypePASSWORD(retypePASSWORD);
	  
     
     CusService Customer =new CusService();
     Customer.AddDetails(c);
     RequestDispatcher dispacher=request.getRequestDispatcher("/CustomerDashboard.jsp");
	 dispacher.forward(request, response);
	 
		
	}

}
