package com.access.modifier.model;

import com.access.modifer.Student;

public class Sample {

	public static void main(String[] args) {
		  Student s = new com.access.modifer.Student();
   	   System.out.println(s.rollNo);          //method
   	   s.printRollNumber();              
      }

	} 
