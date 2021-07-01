package com.Virtusa.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.Virtusa.app.Repositories.Crimedto;
import com.Virtusa.app.Repositories.Crimes;




public class CrimeDao {

	
  
	    
//		SessionFactory factory=new Configuration()
//	            .configure("hibernate.cfg.xml")
//	            .addAnnotatedClass(Crimes.class)
//	            .buildSessionFactory();
//   
//	   Session session =factory.getCurrentSession();
//	   try {
//	  	 System.out.println("Creating new Student");
//	  	 Crimes crime = new Crimes("101","mani","skd","nothing","25/05/0222","mkasjd");
//	  	 session.beginTransaction();
//	  	 
//	  	 System.out.println("Saving the transaction");
//	  	 session.save(crime);
//	  	 session.getTransaction().commit();
//	  	 System.out.println("Done");
//	   }
//	   finally {
//	  	 factory.close();
//	   }
	  }
   



