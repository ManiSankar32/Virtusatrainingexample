package com.IssueManagement;


import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;

import com.IssueManagement.Controller.*;
import com.IssueManagement.Repository.getConnection;

import junit.framework.TestCase;

public class User extends TestCase {
      
	   Connection conn =getConnection.connection();
	   Registerdetails reg = new Registerdetails();
	   UserLogin uss = new UserLogin();
	   public void testApp() throws SQLException, InterruptedException {
	    reg.setName("Mani");
	    reg.setPassword("1234");
	    reg.setEmailId("mani@gmail.com");
	    
	    assertEquals("Mani", reg.getName());
	    assertTrue(UserLogin.Savedata(conn, reg));
	   }
	   
}
