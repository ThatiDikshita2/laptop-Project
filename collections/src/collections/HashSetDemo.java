package collections;
import java.util.HashSet;
//Insertion order won'tbe maintained.
//HashCodeElements are added based on hashcode of the  object
//Duplicates are not allowed.
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<Integer> hs = new HashSet<>();
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
