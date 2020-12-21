package com.itp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.service.PastProjectService;
import com.itp.service.SearchProject;

import oop.itp.model.PastProject;

/**
 * Servlet implementation class SearchPastproject
 */
@WebServlet("/SearchPastproject")
public class SearchPastproject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPastproject() {
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
		String proect_ID = request.getParameter("search");
		
		PastProject p = new PastProject();
		p.setProect_ID(proect_ID);
		
		SearchProject serProject = new SearchProject();
		
		ArrayList<PastProject> pastProjectsList = serProject.getPastProjects(p);
		
		if(pastProjectsList.size()!= 0) {
			request.setAttribute("Array",pastProjectsList);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/search.jsp") ;
			dispatcher.forward(request, response);
		}
			
			
		else  {
			request.setAttribute("valuesearch","no values found from" +"\t" +"\t"+ proect_ID);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Search_unsuccess.jsp") ;
			dispatcher.forward(request, response);
		}

		doGet(request, response);
	}

}
