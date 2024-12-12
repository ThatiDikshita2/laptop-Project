package com.access.service;

import com.access.modifer.Student;

public class SubClass extends Student{
        public static void main(String[] args) {
     	   new SubClass().test();
        }
     	   public void test() {
     		   System.out.println(rollNo);         //method
     		   printRollNumber();
     	   }
}

