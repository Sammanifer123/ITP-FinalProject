package com.itp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itp.util.DatabaseUtil;

import oop.itp.model.Customer;
import oop.itp.model.Owner;


public class CusService {
	
			
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	public String AddDetails(Customer c) {
		System.out.println("connect to db");
		try {
			connection = DatabaseUtil.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "INSERT INTO customer(Name,Address,contactNum,NIC,Email,PASSWORD,retypePASSWORD) Values(?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("WORKING FINE");
			//preparedStatement.setInt(1,c.getUID());
			preparedStatement.setString(1,c.getName());
			preparedStatement.setString(2,c.getAddress());
			preparedStatement.setInt(3,c.getContactNum());
			preparedStatement.setString(4,c.getNIC());
			preparedStatement.setString(5,c.getEmail());
			preparedStatement.setString(6,c.getPASSWORD());
			preparedStatement.setString(7,c.getRetypePASSWORD());
			
			System.out.println("connect to db2");
			
			System.out.println("connect to db2");
			preparedStatement.execute();
			System.out.println("inserted Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}
	public String UpdateCustomerDetails(Customer  c) {
		System.out.println("connect to db");
		System.out.println("Object :"+ c.getName());
		System.out.println("id :"+ c.getUID());
		
		try {
			connection = DatabaseUtil.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "UPDATE customer set Name = ?, Address = ?,contactNum = ? ,NIC = ? ,Email = ? ,PASSWORD = ? ,retypePASSWORD = ? WHERE UID = ?";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("New");
			System.out.println("sammani");
			
			preparedStatement.setString(1, c.getName());
			preparedStatement.setString(2, c.getAddress());
			preparedStatement.setInt(3,c.getContactNum());
			preparedStatement.setString(4, c.getNIC());
			preparedStatement.setString(5, c.getEmail());
			preparedStatement.setString(6,c.getPASSWORD());
			preparedStatement.setString(7,c.getRetypePASSWORD());
			preparedStatement.setInt(8,c.getUID());
			
			System.out.println("sammani");
			System.out.println("connect to db2");
			

			preparedStatement.execute();
			System.out.println("updated Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}

	public String DeleteCustomerDetails(Customer c) {
		System.out.println("connect to db");
		System.out.println("id :"+ c.getUID());
		
		try {
			connection = DatabaseUtil.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "DELETE FROM customer WHERE UID = ?";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("DELETING");
			preparedStatement.setInt(1,c.getUID());
		
			
			System.out.println("connect to db2");
			

			preparedStatement.execute();
			System.out.println("Deleted Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}



}




