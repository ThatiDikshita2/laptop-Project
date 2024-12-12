package arrays;
 // String[] args uses for passing Arguments at command prompt
  //  Run as Configurations then in Arguments enter the values later run
public class CommandLineArgsDemo {

	public static void main(String[] args) {
	        String s1 = args[0];
	        String s2 = args[1];
	        System.out.println(s1+s2);
	        
	        int i1 = Integer.parseInt(s1);
	        int i2 = Integer.parseInt(s2);
	        System.out.println(i1+i2);
	}
}
