import java.util.Scanner;

public class MyAtmPin{
	static double balance = 5000.0;
	static int originalPin = 1234;
	
	public static boolean authenticat (int pin) {
		if (pin == originalPin) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int pin = 0;
		Scanner in = new Scanner (System.in);
		int option = 0;
		do {
			System.out.println("ATM APPLICATION");
			System.out.println("---------------");
			System.out.println("1. Balance Check : ");
			System.out.println("2. Deposit Amount : ");
			System.out.println("3. Withdraw Amount : ");
			System.out.println("0. Exit");
			System.out.println("Please select option :");
			option = in.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("please enter pin: ");
				pin = in.nextInt();
				
				if(authenticat(pin)) {
					System.out.println("Balance"+balance);
				}else {
					System.out.println("Invalid pin");
				}
				
				break;
			case 2:
				System.out.println("please enter pin: ");
				pin = in.nextInt();
				
				System.out.println("Please enter deposit amount:");
				double depositAmount = in.nextDouble();
				balance = balance + depositAmount;
				if(authenticat(pin)) {
					System.out.println("Deposit is sucessful!");
				}else {
					System.out.println("Invalid pin");
				}
				
				
				break;
			case 3:
				System.out.println("please enter pin: ");
				pin = in.nextInt();
				
				System.out.println("Please enter withdraw amount");
				double withdrawAmount = in.nextDouble();
				balance = balance - withdrawAmount;
				if(authenticat(pin)) {
					System.out.println("withdraw is successful!");
				}else {
					System.out.println("Invalid pin");
				}
				
			;
			    break;
			case 0:
				System.out.println("thankyou for using ATM");
				System.out.println("have a nice day!");
				System.exit(0);//Terminate JAM
				break;
			default:
				System.out.println("Invalid Option!");
				break;
			
			}//switch
			
		}while (option !=0);
		
	}//main

}//class