package exceptions;
//Try catch shortcut ctrl=spacebar and enter on first option 
public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
        System.out.println(10/5);
       try {
    	   System.out.println(10/0);
	} catch (ArithmeticException e) {
		System.out.println("Cannot divide by 0");
	}
       System.out.println(10/2);
	}
}
