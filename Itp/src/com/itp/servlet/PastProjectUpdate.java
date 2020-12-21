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
 * Servlet implementation class PastProjectUpdate
 */
@WebServlet("/PastProjectUpdate")
public class PastProjectUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PastProjectUpdate() {
        super();
       
    }

	
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
		String proect_ID=request.getParameter("proect_ID");
		PastProject p1=new PastProject();
		
		
		p1.setDescription(Description);
		p1.setType(Type);
		p1.setProect_ID(proect_ID);
	     PastProjectService updatePastProject =new PastProjectService();
		updatePastProject.updatePastProject(p1);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/EditPastProjects.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	
	
	
	}

 
}
