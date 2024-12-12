package collections;
import java.util.ArrayDeque;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> d = new ArrayDeque();
        System.out.println(d.isEmpty());
        d.offerFirst(100);
        d.offerFirst(200);
        d.offerFirst(300);
        d.offerFirst(400);
        System.out.println(d);
        
        d.offerLast(10);
        d.offerLast(20);
        d.offerLast(30);
        d.offerLast(40);
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
        System.out.println(d);
        
        
	}

}
