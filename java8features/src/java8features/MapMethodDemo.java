package java8features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapMethodDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(55000,45000,25000,35000,65000);
          System.out.println(salaries);
          List<Integer> incrementSalaries = new ArrayList<>();
          Function<Integer, Integer> fun = (salary) -> salary + 5000;
          incrementSalaries = salaries.stream()
        		                         .map(fun) 
        		                         .toList();
          System.out.println(incrementSalaries);
          
          //increment each salary by10%
          List<Double> incrSalaries = salaries.stream()
        		                              .map((salary)->salary = salary * .1)
        		                              .toList();
          System.out.println(incrSalaries);
          
          
	}

}
