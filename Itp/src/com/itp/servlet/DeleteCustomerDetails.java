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

@WebServlet("/DeleteCustomerDetails")
public class DeleteCustomerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteCustomerDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Customer c2= new Customer();
		c2.getUID();
		System.out.println("UID:"+c2.getUID());
		CusService deleteCustomer=new  CusService();
		deleteCustomer.DeleteCustomerDetails(c2);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/succes.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
		
	}

}
