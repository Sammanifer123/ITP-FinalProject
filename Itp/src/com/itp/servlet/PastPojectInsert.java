package com.itp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.service.PastProjectService;

import oop.itp.model.PastProject;

/**
 * Servlet implementation class PastPojectInsert
 */
@WebServlet("/PastPojectInsert")
public class PastPojectInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PastPojectInsert() {
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
		String Description =request.getParameter("Description");
		String Type= request.getParameter("Type");
		PastProject p=new PastProject();
		
		
		p.setDescription(Description);
		p.setType(Type);
		 
		PastProjectService PastProject =new PastProjectService();
		PastProject.AddDetails(p);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdminDashboard.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

	
	}


