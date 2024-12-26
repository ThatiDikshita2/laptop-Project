package com.edubbridge.hibapp1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.edubbridge.hibapp1.model.Address;
import com.edubbridge.hibapp1.model.Customer;
import com.edubbridge.hibapp1.model.Employee;

public class SaveCustomer {
 public static void main(String[] args) {
	Address customerAddress = new Address();
	customerAddress.setCity("Hyderabad");
	customerAddress.setState("TG");
	customerAddress.setCountry("India");
	customerAddress.setPincode(5000055);
	
	Customer customer = new Customer();
	customer.setCustomerName("Wills");
	customer.setCustomerMobile(9876543210L);
	customer.setCustomerAddress(customerAddress);
	 
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
	    session.save(customer);   //Insert operation
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
