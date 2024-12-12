package exceptions;
//Unchecked Exception
public class InSufficientBalanceException extends RuntimeException{
	 private static final long serialVersionUID = 1L;
     public InSufficientBalanceException() {
    	 super();
     }
     public InSufficientBalanceException(String msg) {
    	 super(msg);
     }
}
