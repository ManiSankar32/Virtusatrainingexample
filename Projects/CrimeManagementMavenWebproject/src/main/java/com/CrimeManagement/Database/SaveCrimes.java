package com.CrimeManagement.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.CrimeManagement.Model.Crime2;
import com.CrimeManagement.Model.CrimeDetails;
import com.mysql.cj.protocol.Resultset;


public class SaveCrimes {
public static boolean Savecrimes(CrimeDetails crime) {
	
	
	try {
		Connection conn =ConnectionManagement.GetConnection();
     	PreparedStatement st1 = conn.prepareStatement("insert into Crime values(?,?,?,?,?,?,?)");
		st1.setInt(1, crime.getCrimeid());
     	st1.setString(2,crime.getCriminalid());
		st1.setString(3, crime.getInformer());
        st1.setString(4, crime.getSuspectDetails());
        st1.setString(5, crime.getDescription());
        st1.setString(6, crime.getDate());
        st1.setString(7, crime.getPlace());
        st1.execute();
        conn.close();
        return true;
	
        }catch(Exception e) {
        	e.printStackTrace();
        }
	 return false;
	
}
public static boolean UpdateCrimeStatus(Crime2 crime) {
	try {
		Connection conn =ConnectionManagement.GetConnection();
		PreparedStatement st1 = conn.prepareStatement("select description from Crime where crimeid=?");
     	st1.setInt(1, crime.getCrimeid());
     	ResultSet rs = st1.executeQuery();
     	String des="";
     	while(rs.next()) {
     		des=rs.getString(1);
     	
		PreparedStatement st2 = conn.prepareStatement("insert into CrimeStatus values(?,?,?,?,?,?,?)");
		st2.setInt(1, crime.getCrimeid());
     	st2.setString(2,crime.getCriminalid());
        st2.setString(3,des );
        st2.setString(4, crime.getPunishment());
        st2.setString(5, crime.getDate());
       
        st1.execute();
        conn.close();
        return true;
     	}	
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return false;
	
}


}
