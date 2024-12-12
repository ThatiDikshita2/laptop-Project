package exceptions;
//Checked Exception
public class InvalidAgeException extends Exception{

	 private static final long serialVersionUID = 1L;
     public InvalidAgeException() {
    	 super();
     }
     public InvalidAgeException(String msg) {
    	 super(msg);
     }
}
