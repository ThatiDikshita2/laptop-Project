package com.edubbridge.hibapp1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.edubbridge.hibapp1.model.Employee;

public class DeleteEmployeeUsinghql {
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
	//String hql = "delete from Employee where employeeName=?1";
	 String hql = "delete from Employee where employeeName = :name";
	 
	Query<Employee> query = session.createQuery(hql);
	//query.setParameter(1,"Jones");
	query.setParameter("name","Wills");
	 try {
		 int status = query.executeUpdate();
		 if(status >=1) {
		System.out.println("Sucess");
		tx.commit();
		}else {
			System.out.println("Fail");
		}
	 }catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	 
	 //6.Close resources
	 session.close();
	 factory.close();
 }
}

