package string_handling;

public class StringDemo3 {

	public static void main(String[] args) {
		// String is Immutable (Not Changeable)
        String s="Java";
        System.out.println(s);
        
        String s2=s.concat("23");
        System.out.println(s2);
        System.out.println(s);
        
        String s3=s.toUpperCase();
        System.out.println(s3);
        System.out.println(s);
        
        String s4=s.substring(2);
        System.out.println(s4);
        System.out.println(s);     
	}
}
