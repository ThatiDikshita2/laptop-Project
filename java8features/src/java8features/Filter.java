package java8features;
import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<Integer> Salaries = Arrays.asList(55000,45000,25000,35000,65000);
		 List<Integer> UpdatedSalaries =(salaries -> Salaries + 5000);
      System.out.println("UpadtedList: "+ UpdatesSalaries);

	}

}
