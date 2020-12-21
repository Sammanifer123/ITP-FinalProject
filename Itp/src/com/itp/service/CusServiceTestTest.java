package com.itp.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import oop.itp.model.Customer;
import oop.itp.model.Owner;

public class CusServiceTestTest {
 private static CusService On;
	@Before
	public void setUp() throws Exception {
		On= new CusService();
	}

	@After
	public void tearDown() throws Exception {
	}
	private Customer createcustomerObject() {
		Customer customer= new Customer();
		customer.setName("sammani");
		customer.setAddress("katuwapitiya");
		customer.setContactNum(777465780);
		customer.setEmail("Sammanif1@gmail.com");
		customer.setNIC("987721430V");
		customer.setRetypePASSWORD("Sammanif.123");
		customer.setRetypePASSWORD("Sammanif.123");
		return customer;
	}

	@Test
	public void testAddDetails() {
		String status = On.AddDetails(createcustomerObject());
		assertEquals("sucess", status);
	}

	@Test
	public void testUpdateCustomerDetails() {
		Customer customer = createcustomerObject();
		String status= On.UpdateCustomerDetails(customer);
		assertEquals("sucess", status);
	}

	@Test
	public void testDeleteCustomerDetails() {
		Customer customer = createcustomerObject();
		String status= On.DeleteCustomerDetails(customer);
		assertEquals("sucess", status);
	}

}
