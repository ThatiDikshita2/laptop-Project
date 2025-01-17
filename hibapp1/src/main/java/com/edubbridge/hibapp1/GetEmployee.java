package com.edubbridge.hibapp1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.edubbridge.hibapp1.model.Employee;

public class GetEmployee {
	public static void main(String[] args) { 
		 String configFile = "/com/edubbridge/hibapp1/config/hibernate.cfg.xml";
		 
		 //1.Create configuration object
		 Configuration cfg = new Configuration();
		 
		 //2.Read hibernate.cfg.xml file
		 cfg.configure(configFile);
		 
		 //3.Build SessionFactory object.
		 SessionFactory factory = cfg.buildSessionFactory();
		 
		 //4.Open session with DB
	      Session session = factory.openSession();
	      
	      //5.Perform operation (get one employee details)
	      Employee emp = session.get(Employee.class, 1);
	      if(emp != null) {
	    	  System.out.println(emp);
	      }else {
	    	  System.out.println("Not Found");
	    	  }
	      }
}
