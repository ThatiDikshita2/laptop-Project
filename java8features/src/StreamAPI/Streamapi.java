package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streamapi {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String>longestString = strings
        		                    .stream()
        		                    .max(Comparator.comparingInt(String::length));
        System.out.println(longestString);       
}
	    List<Person>persons = Arrays.asList(
	    		new Person("Alice",25),
	    		new Person("Bob",30),
	    		new Person("Charlie",35)    		
	    		);
	     
	    		
}
