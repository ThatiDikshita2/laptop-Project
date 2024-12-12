package collections;
import java.util.Stack;
//LIFO=Last in first out
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stack<String> s = new Stack<>();
         s.push("Java");
         s.push("Python");
         s.push("Angular");
         s.push("ReactJs");
         System.out.println(s);
         System.out.println(s.pop()); //pop we will get last element
         System.out.println(s);
         
         System.out.println(s.pop());  //pop we will get last element which is after Reactjs
         System.out.println(s);
         
         System.out.println(s.peek()); //peek we will get first element
         
         System.out.println(s.isEmpty());
        
	}

}
