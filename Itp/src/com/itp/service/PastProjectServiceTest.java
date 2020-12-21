package com.itp.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import oop.itp.model.PastProject;

public class PastProjectServiceTest {
    private static PastProjectService pastprojects;
	@Before
	public void setUp() throws Exception {
		pastprojects =new PastProjectService();
	}

	@After
	public void tearDown() throws Exception {
	}
	private PastProject createpastprojectObject() {
		PastProject pastProject=new PastProject();
		pastProject.setType("aluminium works propoties");
		pastProject.setDescription("dfnjkdfbkjdbjkdf");
		return pastProject;
	}

	@Test
	public void testAddDetails() {
		String status=pastprojects.AddDetails(createpastprojectObject());
		assertEquals("sucess", status);
		
	}

	@Test
	public void testUpdatePastProject() {
		PastProject pastProject=createpastprojectObject();
		String status=pastprojects.updatePastProject(pastProject);
				assertEquals("sucess", status);
	}

	@Test
	public void testDeletePastProject() {
		PastProject pastProject=createpastprojectObject();
		String status=pastprojects.DeletePastProject(pastProject);
				assertEquals("sucess", status);
		
	}

}
