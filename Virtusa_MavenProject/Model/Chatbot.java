package com.IssueManagement.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import com.IssueManagement.Controller.*;

public class Chatbot extends UserLogin {
	public static void SaveIssues(Connection conn,String email,Scanner sc) throws InterruptedException, SQLException {
		String  date=String.valueOf(java.time.LocalDate.now());
		String value=chatbot2(conn,email,sc);
		String name = null;
		PreparedStatement st1 = conn.prepareStatement("select * from users");
		ResultSet rs =st1.executeQuery();
        while(rs.next()) {
        	if(email.equals(rs.getString(2))) {
        		name=rs.getString(1);
        	}
        }
        System.out.println(name);
        PreparedStatement st = conn.prepareStatement("insert into issues(name,email,issuedescription,date)values(?,?,?,?)");
        st.setString(1, name);
        st.setString(2, email);
		st.setString(3, value);
        st.setString(4, date);
        st.execute();
		//return value;
        IssueMangamentUser.DisplayUser(conn,email);
	}
	
	public static String chatbot2(Connection conn,String email, Scanner sc) throws InterruptedException {
   //    Scanner sc1 = new Scanner(System.in);
 		int input = 0;
		String str = null;
		System.out.println("Select Your Issue in the given Issues: ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1.Payment Issues");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2.Food Issues");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("3.Application Issues");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("4.Genral Issues");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("5.Order Issues");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("6.Other Issues");
		System.out.println("Select Your Issue No : ");
		try {
	      input=sc.nextInt();
		}catch(Exception e) {System.out.println(e);}
		if(input==1)
		{
			//System.out.println("Select one");
			return method1(sc, conn, str);
		}
		else if(input ==2){
			return method2(sc,conn,str);
		}
		else if(input == 3) {
			return method3(sc,conn,email);     
		}else if(input==4) {
			return method4(sc,conn,email);
		}else if(input==5) {
			return method5(sc,conn,email);
		}
		else if(input == 6) {
			return  method6();
		}
		
		return str;
 }
 public static String method1(Scanner sc,Connection conn,String email) throws InterruptedException {
	   System.out.println("1.Money Deducted But Order Not Placed");
	   TimeUnit.SECONDS.sleep(1);
		System.out.println("2.Common Payment Errors");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("3.Why Was my Payment Rejected");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("4.How to add My credit Card");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("6.Other Issues");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Go back-9");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Select one");
		int input1=sc.nextInt();
		if(input1==2)
		{
			System.out.println("1.Insufficient Funds");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("2.Issuer or Cardholder restriction");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("3.Declined");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("4.Transaction Not allowed");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("6.Other Issues");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Go back-9");
			int input11 = sc.nextInt(); 
			if(input11 == 1) return " Insufficient funds" ;
		 else if(input11==2) {
			  return "issuer or Cardholder restriction";
		}else if(input11==3) {
			  return "Declined";
		}else if(input11==4) {
			  return "Transaction Not allowed";
		}else if(input11 == 6) {
			return  method6();
		}       	        
		else if(input11==9) {
			 chatbot2(conn, email, sc);
		}	        
		}
		if(input1 == 1) return " Money Deducted But Order Not Placed" ;
		
		else if(input1==3) {
		  return "Why Was my Payment Rejected";
	}else if(input1==4) {
		  return "How to add My credit Card";
	}else if(input1 == 6) {
		return  method6();
	}	       	        
	else if(input1==9) {
		 chatbot2(conn, email, sc);
	}
		return null;	        
	}
 
 public static String method2(Scanner sc, Connection conn, String email) throws InterruptedException {
	   System.out.println("1.Food is Tasteless change the restaurant");
	   TimeUnit.SECONDS.sleep(1);
	   System.out.println("2.food which i ordered is wasted because it is Incorrectly cooked");
	   TimeUnit.SECONDS.sleep(1);
	   System.out.println("3.Food become bad smell due to delay");
	   TimeUnit.SECONDS.sleep(1);
	   System.out.println("4.Food items are missing in my order");
	   TimeUnit.SECONDS.sleep(1);
		System.out.println("5.The quantity of food is not adequate");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("6.Other Issues");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Go back-9");
		int input2=sc.nextInt();
		if(input2 == 1) return " Food is Tasteless change the restaurant" ;
		 else if(input2==2) {
			  return "food which i ordered is wasted because it is Incorrectly cooked";
		}else if(input2==3) {
			  return "Food become bad smell due to delay";
		}else if(input2==4) {
			  return "Food items are missing in my order";
		}else if(input2==5) {
			  return "The quantity of food is not adequate";
		}else if(input2 == 6) {
			return  method6();
		}else if(input2==9) {
			 chatbot2(conn, email, sc);
		}
		return null;	        
 }
 public static String method3(Scanner sc, Connection conn, String email) throws InterruptedException {
		System.out.println("1.Your Application is Hanging");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2.Some one got hacked the application in my mobile");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("3.Location is Not working Properly");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("4.Nearby Restaurants are not visible in your application");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("5.Some Options are missing");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("6.Other Issues");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Go back-9");
		int input3=sc.nextInt();
		if(input3 == 1) return " Your Application is Hanging" ;
		 else if(input3==2) {
			  return "Some one got hacked the application in my mobile";
		}else if(input3==3) {
			  return "Location is Not working Properly";
		}else if(input3==4) {
			  return "Nearby Restaurants are not visible in your application";
		}else if(input3==5) {
			  return "Some Options are missing";
		}else if(input3 == 6) {
			return  method6();
		}
		else if(input3==9) {
			 chatbot2(conn, email, sc);
		}
		return null;
 }
 public static String method4(Scanner sc, Connection conn, String email) throws InterruptedException {
	 System.out.println("1.I have Coupon related issues");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("2.Coupons are Not Working");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("3.Your Employees behavoiur is Not Good");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("4.Some Nearby Restaurants are showing high costs");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("5.Your Delivery Is So Slow");
	 TimeUnit.SECONDS.sleep(1);
	 System.out.println("6.Other Issues");
	 TimeUnit.SECONDS.sleep(1);
	 System.out.println("Go back-9");
		int input4=sc.nextInt();
		if(input4 == 1) return " I have Coupon related issues" ;
		 else if(input4==2) {
			  return "Coupons are Not Working";
		}else if(input4==3) {
			  return "Your Employee behavoiur is Not Good";
		}else if(input4==4) {
			  return "Some Nearby Restaurants are showing high costs";
		}else if(input4==5) {
			  return ".Your Delivery Is So Slow";
		}else if(input4 == 6) {
			return  method6();
		}else if(input4==9) {
			 chatbot2(conn, email, sc);
		}
		return null;	       
 }
 public static String method5
 (Scanner sc, Connection conn, String email) throws InterruptedException {
	 System.out.println("1.I haven't received my last Order");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("2.Order is Not Valid error");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("3.How can i delete my Orders");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("4.Order canceled but not refunded");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("5.My Order Was Not Packed Perfectly it has Some Issues");
	 TimeUnit.SECONDS.sleep(1);	
	 System.out.println("6.Other Issues");
		System.out.println("Go back-9");
		int input5=sc.nextInt();
		if(input5 == 1) {return " I haven't received my last Order" ;
		} else if(input5==2) {
			  return "Order is Not Valid error";
		}else if(input5==3) {
			  return "How can i delete my Orders";
		}else if(input5==4) {
			  return "Order canceled but not refunded";
		}else if(input5==5) {
			  return "My Order Was Not Packed Perfectly it has Some Issues";
		}else if(input5 == 6) {
			return  method6();
		}else if(input5==9) {
			 chatbot2(conn, email, sc);
		}
		return null;	      
 }
 @SuppressWarnings("resource")
public static String method6() {
	 System.out.println("Type Your issue ");
	
	Scanner sc1= new Scanner (System.in); 
		String other = sc1.nextLine();
		return other;
 }
}
