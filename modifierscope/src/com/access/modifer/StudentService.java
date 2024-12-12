package com.access.modifer;

//Constructor access public static
public class  StudentService{
       public static void main(String[] args)    {                                 
    	   Student s = new Student();
    	   System.out.println(s.rollNo);          //method
    	   s.printRollNumber();              
       }
}
