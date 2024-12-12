import java.util.Scanner;
public class MyAtmApp {
     static double balance=5000.0;
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner in = new Scanner(System.in);
		int option=0;
		do {
			 System.out.println("ATM APPLICATION");
			 System.out.println("--------------");
			 System.out.println("1.Balance Check"); 
			 System.out.println("2.Deposit Amount");
			 System.out.println("3.Withdrawn Amount");
			 System.out.println("0.Exit");
			 System.out.println("Please select option:");
			 option = in.nextInt();
			 switch(option) {
			 case 1:
				 System.out.println("Balance:"+balance);
				 break;
			 case 2:
				 System.out.println("Please enter deposit amount:");
				 double depositAmount=in.nextDouble();
				 balance = balance + depositAmount;
				 System.out.println("Deposit is successful:");
				  break;
			 case 3:
				 System.out.println("Please enter withdraw amount:");
				 double withdrawAmount=in.nextDouble();
				 balance = balance - withdrawAmount;
				 System.out.println("Withdraw is successfull");
				  break;
			 case 0:
				 System.out.println("Thank you for using ATM");
				 System.out.println("Have a nice day!");
				 System.exit(0);
				  break;
			
		     default:
		    	 System.out.println("Invalid Option!");
		    	 break;
			 }
		} while (option!=0);
	}

}
