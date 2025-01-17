package collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		//Normal ArrayList
		ArrayList al = new ArrayList();
		System.out.println(al.size());
	     al.add(100);
	     al.add(200);
	     al.add("Java");
	     al.add("Python");
	     al.add(45000.0);
	     al.add(35000.0);
	     System.out.println(al.size());
	     System.out.println(al);
	     Object obj = al.get(0);
	     int x=(int) obj;
	     System.out.println(x);
	     
	     //Generic version Arraylist-Type safety & avoids typecasting 
	     ArrayList<Integer> subjectMarks = new ArrayList<>();
	     subjectMarks.add(44);
	     subjectMarks.add(55);
	     subjectMarks.add(88);
	     subjectMarks.add(33);
	     subjectMarks.add(66);
	     //subjectMarks.add("Java");   Error Not a integer type
	     System.out.println(subjectMarks);
	     
	     int s1 = subjectMarks.get(0);
	     System.out.println(s1);
	     
	     //Create an arraylist with a group of course names like java, python, angular, reactjs
	      ArrayList<String> courseNames = new ArrayList<>();
            courseNames.add("Java");
	        courseNames.add("Python");
	        courseNames.add("Angular");
	        courseNames.add("ReactJS");
	        courseNames.add("JS");
	           
	        System.out.println(courseNames);    
	     
}
}