package com.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.HibernateDemo.entity.Student;



public class CreateStudentDemo {
public static void main(String args[]) {
	SessionFactory factory=new Configuration()
			                                .configure("hibernate.cfg.xml")
			                                .addAnnotatedClass(Student.class)
			                                .buildSessionFactory();

 Session session =factory.getCurrentSession();
 try {
	 System.out.println("Creating new Student");
	 Student tempstudent = new Student("mani","sankar","mani@gmail.com");
	 session.beginTransaction();
	 
	 System.out.println("Saving the transaction");
	 session.save(tempstudent);
	 session.getTransaction().commit();
	 System.out.println("Done");
 }finally {
	 factory.close();
 }
}
}
