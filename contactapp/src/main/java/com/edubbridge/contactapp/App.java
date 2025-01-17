package com.edubbridge.contactapp;
import java.util.List;
import java.util.Scanner;

import com.edubbridge.contactapp.dto.contact;
import com.edubbridge.contactapp.service.ContactService;

public class App 
{
    private static final String Name = null;
	public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
        ContactService service = new ContactService();
    	while(true) {
    		  System.out.println( "CONTACT APPLICATION" );	
    		  System.out.println("==============");
    		  System.out.println("1.Add Contact");
    		  System.out.println("2.View Contact");
    		  System.out.println("3.Search Contact");
    		  System.out.println("4.Update Contact");
    		  System.out.println("5.Delete Contact");
    		  System.out.println("0.Exit");
    		  System.out.println("Please choose One option:");
    		  int option = in.nextInt();
    		  
    		  switch(option) {
    		  case 1:
    			  System.out.println("Enter Contact Name:");
    			  String name = in.next();
    			  System.out.println("Enter Contact Email:");
    			  String email = in.next();
    			  System.out.println("Enter Contact Mobile:");
    			  Long mobile = in.nextLong();
           		  contact newContact = new contact();
    			  newContact.setName(name);
    			  newContact.setEmail(email);
    			  newContact.setMobile(mobile);
    			  int status = service.addContact(newContact);
    			  if(status >=1) {
    				  System.out.println("new contact saved!");
    			  }else {
    				  System.out.println("Failed");
                 	}
    			  break;
    		  case 2:
    			  List<contact> contacts = service.getAllContacts();
    			  for(contact c: contacts) {
    				  System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getEmail()+c.getMobile());
    			  }
    			  System.out.println("view contacts");
    			  break;
    		  case 3:
            	     System.out.println("Enter contact name:");
					 String Name = in.next();
                     contact c= service.getContactByName(Name);
                  
     				if (c!= null) {
     					  System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getEmail()+c.getMobile());
					} else {
						System.out.println("Invalid Name");
					}
					break;
    		  case 4:
    			  System.out.println("Enter contact id:");
			      int id1 = in.nextInt();
    			  System.out.println("Enter contact Name:");
    			  String name1 = in.next();
    			  System.out.println("Enter Contact Email:");
    			  String email1 = in.next();
    			  System.out.println("Enter Contact Mobile:");
    			  Long mobile1 = in.nextLong();
           		  contact updateContact = new contact();
    			  updateContact.setName(name1);
    			  updateContact.setEmail(email1);
    			  updateContact.setMobile(mobile1);
    			  int status1 = service.updateContact(updateContact);
    			  if(status1 >=1) {
    				  System.out.println("update contact!");
    			  }else {
    				  System.out.println("Failed");
                 	}
    			  break;
    		case 5:
    			 System.out.println("Enter contact Name:");
    			 String deletecontact = in.next();
          		  contact deleteContact = new contact();					 
				int status2 = service.deleteContact(deletecontact);
   			  if(status2 >=1) {
   				  System.out.println("Contact deleted successfull");
   			  }else {
   				  System.out.println("Failed");
                	}
         		  break;
    		case 0:
  			  System.out.println("Bye!!");
  			  System.exit(0);
  			  default:
  				  System.out.println("Invalid option!");
  				  break;        			  
    		  }
    	}      
    }
	private static contact getContactByName(String name2) {
		// TODO Auto-generated method stub
		return null;
	}
}
