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
 * Servlet implementation class PastProjectDelete
 */
@WebServlet("/PastProjectDelete")
public class PastProjectDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PastProjectDelete() {
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
		
	  String projectID=request.getParameter("proect_ID");
		PastProject p=new PastProject();
		p.setProect_ID(projectID);
	
		System.out.println("proect_ID:"+p.getProect_ID());
		PastProjectService deleteproject=new PastProjectService();
		deleteproject.DeletePastProject(p);
		 
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/EditPastProjects.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
