package exceptions;
  //Finally means for mandatory code whether the exception is there or not mandatory code will print before the exception
public class FinallyDemo {

	public static void main(String[] args) {
		 System.out.println("start");
		 
		 try {
			 System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("Cannot divide by 0");
		} finally {
			System.out.println("Mandatory Code");
		}
		 System.out.println("end");
	}
}

