package com.edubbridge.hibapp1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.edubbridge.hibapp1.model.Employee;

public class DeleteEmployee {
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
	 
	 //5.Get Transaction
	 Transaction tx = session.beginTransaction();
	 Employee emp = session.get(Employee.class, 2);
	 if(emp != null) {
	 try {
		 
	    session.delete(emp);         //Delete operation
		tx.commit();                //Commit transaction
		System.out.println("Success");
	 }catch (Exception e) {
		 tx.rollback();             //Cancel transaction
		 e.printStackTrace();
	 }
	 }else {
   	  System.out.println("Not Found");
   	  }
	 
	 //6.Close resources
	 session.close();
	 factory.close();
 }
}

