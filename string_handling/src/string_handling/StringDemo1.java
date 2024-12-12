package string_handling;

public class StringDemo1 {

	public static void main(String[] args) {
		//Using Literal
     String s1="Java";
     
     // Using new operator
     String s2=new  String("python");
     System.out.println(s1);
     System.out.println(s2);
     
     String s3="Java";
     String s4=new  String("python");
     System.out.println(s1==s3);
     System.out.println(s2==s4);
	}
}
