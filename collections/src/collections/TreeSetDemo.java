package collections;
import java.util.TreeSet;
import java.util.Comparator;
//Insertion order will be maintained.
//Duplicates are not allowed.
public class TreeSetDemo {
	public static void main(String[] args) {
		
		//TreeSet<Integer> hs = new TreeSet<>();
		TreeSet<Integer> hs = new TreeSet<>(Comparator.reverseOrder());
		hs.add(100);
		hs.add(300);
		hs.add(500);
		hs.add(400);
		hs.add(200);
		hs.add(600);
		System.out.println(hs);
	
		//TreeSet<String> ts = new TreeSet<>();
		TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());
		ts.add("Java");
		ts.add("Angular");
		ts.add("python");
		ts.add("React");
		System.out.println(ts);
		
		//Traversal 
		for(String course : ts) {
			System.out.println(course);
			
			for(int price : hs) {
				System.out.println(price);
			}
		}
	}

}