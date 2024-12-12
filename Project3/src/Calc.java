
public class Calc {

	public static void Calc(int num,String operation) {
		switch(operation) {
		case"square":
		System.out.println("Square "+num+" is "+(num*num));
		break;
		case"cube":
		System.out.println("Cube "+num+" is "+(num*num));
		break;
		default:
			System.out.println("Invalid Operation");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=10;
     String operation="cube";
     Calc(num, operation);
       double billAmount=1000;
	}
}
