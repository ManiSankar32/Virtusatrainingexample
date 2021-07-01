package com.CrimeManagement;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.*;
import com.CrimeManagement.Database.ConnectionManagement;
import com.CrimeManagement.Database.SaveCrimes;
import com.CrimeManagement.Model.CrimeDetails;



public class CrimeTesting {
	Connection conn =ConnectionManagement.GetConnection();
	  CrimeDetails crm = new CrimeDetails();
	   
	   public void testApp() throws SQLException, InterruptedException {
	    crm.setCrimeid(1);
	    crm.setCriminalid("2");
	    crm.setInformer("mani");
	    crm.setSuspectDetails("hello");
	    crm.setDescription("hello");
	    crm.setDate("25/05/2001");
	    crm.setPlace("ads");
	    assertNotNull(conn);
	    assertEquals("Mani", crm.getInformer());
	    assertTrue(SaveCrimes.Savecrimes(crm));
	    
	   }

	
}
