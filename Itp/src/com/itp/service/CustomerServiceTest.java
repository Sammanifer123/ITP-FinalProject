package com.itp.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import oop.itp.model.Owner;

public class CustomerServiceTest {
	
	private static CustomerService cs;
	
	@Before
	public void setUp() throws Exception {
		cs = new CustomerService();
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	private Owner createOwnerObject() {
		Owner owner = new Owner();
		owner.setName("Sammani");
		owner.setAge(20);
		owner.setEmail("sammani@gmail.com");
		owner.setAddress("Colombo");
		owner.setContactNum(0776123456);
		owner.setPASSWORD("xyZ@09123");
		owner.setRetypePASSWORD("xyZ@09123");
		owner.setWorkingExperience("jhgfdszAszdfghj");
		
		return owner;
	}

	@Test
	public void testAddDetails() throws IOException, ServletException {
		String status =  cs.AddDetails(createOwnerObject());
		assertEquals("sucess", status);
	}

	@Test
	public void testUpdateOwnerDetails() {
		Owner owner = createOwnerObject();
		String status =  cs.UpdateOwnerDetails(owner);
		assertEquals("sucess", status);
	}

	@Test
	public void testDeleteOwnerDetails() {
		Owner owner = createOwnerObject();
		String status =  cs.DeleteOwnerDetails(owner);
		assertEquals("sucess", status);
	}

}
