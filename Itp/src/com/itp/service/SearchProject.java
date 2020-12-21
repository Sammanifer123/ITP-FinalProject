package com.itp.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itp.util.DatabaseUtil;
import com.mysql.jdbc.PreparedStatement;

import oop.itp.model.PastProject;

public class SearchProject {
	private static Connection connection;

	// private static Statement statement;
	private static PreparedStatement preparedStatement;

	public ArrayList<PastProject> getPastProjects(PastProject Project) {
		
		ArrayList<PastProject> projects = new ArrayList<>();
		ResultSet p;
		
		try {
			connection = DatabaseUtil.getConnection();
			System.out.println("connect to db");

			String sql = "select * from pastproject where proect_ID=?";

			ArrayList<PastProject> p1 = new ArrayList<>();

			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			preparedStatement.setString(1, Project.getProect_ID());

			p = preparedStatement.executeQuery();

			while (p.next()) {
				PastProject pastProject = new PastProject(p.getString("proect_ID"), p.getString("Type"), p.getString("Description"));
				projects.add(pastProject);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (PastProject pastProject : projects) {
			System.out.println(pastProject.getProect_ID());
		}

		return projects;
	}
}
