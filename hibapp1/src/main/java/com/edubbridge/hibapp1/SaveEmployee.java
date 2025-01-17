package com.edubbridge.hibapp1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.edubbridge.hibapp1.model.Employee;

public class SaveEmployee {
 public static void main(String[] args) {
	 Employee e1 = new Employee();
	 e1.setEmployeeName("Jones");
	 e1.setEmployeeEmail("Jones@gmail.com");
	 e1.setEmployeeMobile(9887789898L);
	 e1.setEmployeeSalary(98000.00);
	 
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
	 try {
	    session.save(e1);   //Insert operation
		tx.commit();                //Commit transaction
		System.out.println("Success");
	 }catch (Exception e) {
		 tx.rollback();             //Cancel transaction
		 e.printStackTrace();
	 } 
	 //6.Close resources
	 session.close();
	 factory.close();
 }
}
