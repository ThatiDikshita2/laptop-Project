package com.access.modifer;

public class Student {          //class 
	    public int rollNo = 101;  //Variable define
	    public Student() {
	    	rollNo = 102;     //Constructor
	    }                                            //Within same class access done
	    public void printRollNumber() {
	    	System.out.println(rollNo);   //method
	    }
	    
	    public static void main(String[] args) {
	    	Student s = new Student();
	    	 }
	    public void abc() {
	    	printRollNumber();
	    }
	}
