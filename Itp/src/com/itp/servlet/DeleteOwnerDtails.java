package com.itp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.service.CustomerService;

import oop.itp.model.Owner;

/**
 * Servlet implementation class DeleteOwnerDtails
 */
@WebServlet("/DeleteOwnerDtails")
public class DeleteOwnerDtails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOwnerDtails() {
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
		//int UID=Integer.parseInt(request.getParameter("UID"));
		//doGet(request, response);
		 Owner o2= new Owner();
		 
		 o2.getUID();
		 System.out.println("UID:"+o2.getUID());
		 CustomerService deleteOwner =new CustomerService();
			deleteOwner.DeleteOwnerDetails(o2);
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/succes.jsp") ;
			dispatcher.forward(request, response);
			doGet(request, response);
	}

}
