package collections;
import java.util.ArrayList; 
//ArrayList will maintain insertion order
//list will Duplicates allowed
//list is interface arraylist is implementation class

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	System.out.println(al.size());
     al.add(100);
     al.add(200);
     System.out.println(al.size());
     System.out.println(al);
     
     al.add("Java");
     al.add("Python");
     System.out.println(al.size());
     System.out.println(al);
     
     al.add(2, "Angular"); //In second place array add angular 
     System.out.println(al.size());
     System.out.println(al);
     
     al.set(0, 1000); //Set method to Updating operation
     System.out.println(al.size());
     System.out.println(al);
     
     al.remove(0);
     System.out.println(al.size());
     System.out.println(al);
     
     System.out.println(al.get(0));
     System.out.println(al.get(2));
     System.out.println(al.get(al.size()-1));//It display always last array 
     
     al.clear(); //To remove all elements
     System.out.println(al.size());
     System.out.println(al);
	}

}
