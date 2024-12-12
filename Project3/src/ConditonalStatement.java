
public class ConditonalStatement {
   public static boolean isEven(int num) {
	   boolean status=false;
	   if(num%2==0) {
		   status=true;
	   }
	   return status;
   }
   public static boolean isOdd(int num) {
	  boolean status=false;
	  if(num%2==1) {
	  status=true;
	   }
	    return status;
   }
    
   public static void findEvenOrOdd(int num) {
	   if(num%2==0) {
		   System.out.println(num+" is even");
	   }else {
		   System.out.println(num+" is odd");
	   }
   }
      public static void main(String[] args) {
    	 findEvenOrOdd(20);
    	 findEvenOrOdd(23);
    	 findEvenOrOdd(29);
    	  
    	  System.out.println(isEven(10));
    	  System.out.println(isEven(11));
    	  System.out.println(isEven(13));
    	  System.out.println(isOdd(10));
    	  System.out.println(isOdd(19));
    	  System.out.println(isOdd(20));
    	  
    	  
      } 
   
}
