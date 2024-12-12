package exceptions;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			 System.out.println("Interrupted exception!");
		}
	System.out.println("Java");
}
}
