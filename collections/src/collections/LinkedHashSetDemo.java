package collections;
import java.util.LinkedHashSet;
//Insertion order will be maintained.
//Duplicates are not allowed.
public class LinkedHashSetDemo {	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
	        hs.add(100);
	        hs.add(300);
	        hs.add(400);
	        hs.add(200);
	        hs.add(500);
	        System.out.println(hs);
	        
	        hs.add(100);
	        hs.add(200);
	        System.out.println(hs);
	        System.out.println(hs);       
		}
	}

