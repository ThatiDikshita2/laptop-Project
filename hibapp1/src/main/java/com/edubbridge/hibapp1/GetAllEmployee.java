package com.edubbridge.hibapp1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.edubbridge.hibapp1.model.Employee;

public class GetAllEmployee {
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
	      String hql = "from Employee";
	    //  String hql = "from Employee Where employeeSalary>= 40000"
	      Query query = session.createQuery(hql);
	      List<Employee> employees = query.list();
	      for(Employee employee: employees) {
	    	  System.out.println(employee);
	      }     
	      session.close();
	 	  factory.close();
	      }
}