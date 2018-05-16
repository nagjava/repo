package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entites.Student;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	   Student s=new Student();
	      s.setName("guru");
	      s.setPhNumber("1111");
	    session.persist(s);//persisting the object  
	      
	    t.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	      

	}
	
	
	}


