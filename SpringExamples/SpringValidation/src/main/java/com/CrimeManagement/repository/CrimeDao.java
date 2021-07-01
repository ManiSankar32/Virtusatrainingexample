package com.CrimeManagement.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
   
import org.springframework.jdbc.core.RowMapper;   


import org.springframework.jdbc.core.JdbcTemplate;

public class CrimeDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int Save(Crime c) {
		   
		    String sql="insert into Crime(name,salary,designation) values('"+c.getCriminalid()+","+c.getInformer()+","+c.getSuspectDetails()+","+c.getDescription()+","+c.getDate()+","+c.getPlace()+"')";    
		    return template.update(sql);    
		   
	}
	public List<Crime> getCrimes(){    
	    return template.query("select * from Crime",new RowMapper<Crime>(){    
	        public Crime mapRow(ResultSet rs, int row) throws SQLException {    
	            Crime c=new Crime();    
	            c.setCrimeid(rs.getInt(1));    
	            c.setCriminalid(rs.getString(2));    
	            c.setInformer(rs.getString(3));    
	            c.setSuspectDetails(rs.getString(4));
	            c.setDescription(rs.getString(5));
	            c.setDate(rs.getString(6));
	            c.setPlace(rs.getString(7));
	            return c;    
	        }

		
	    
	    });    
	
}
}
