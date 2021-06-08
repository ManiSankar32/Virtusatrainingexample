package com.IssueManagement;
import com.IssueManagement.Controller.*;
import com.IssueManagement.Model.IssueManagementAdmin;
import com.IssueManagement.Repository.getConnection;

import junit.framework.TestCase;

import java.sql.Connection;
import java.sql.SQLException;

public class Admin extends TestCase{

		// TODO Auto-generated method stub
		@SuppressWarnings("static-access")
		public void testApp() throws ClassNotFoundException, SQLException, InterruptedException
		{
		Connection conn =getConnection.connection();
		assertNotNull(conn);
	    IssueManagementAdmin ia = new IssueManagementAdmin();
		assertTrue(AdminLogin.login());
		System.out.println("Success");
		//assertNotNull(AdminLogin.login());
		assertEquals(true,ia.getIssues(conn));
	}
		
	
}
