package string_handling;
//StringBuffer is mutable (Changeable) and equals() performs reference comparison only

public class StringBufferDemo1 {
      public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Java");
		System.out.println(sb);
		sb.append("23");
		System.out.println(sb);	
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb1= new StringBuffer("Java");
		StringBuffer sb2= new StringBuffer("Java");
		System.out.println(sb1.equals(sb2)); //Reference comparison
		
		String s1=new  String("Java");
		String s2=new  String("Java");
		System.out.println(s1.equals(s2));// content comparison
	}
}
