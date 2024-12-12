package arrays;

public class TypeConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i = 130;
    byte b = (byte) i;
    System.out.println(b);
    System.out.println(i);
    
    double d =130.5;
    int i2 = (int) d;
    System.out.println(i2);
    System.out.println(d);
    
    String s1 = "10";
    String s2 = "20";
    int n1 = Integer.parseInt(s1);
    int n2 = Integer.parseInt(s2);
    System.out.println(s1+s2);
    System.out.println(n1+n2);
    
    String s3 = "10.4";
    String s4 = "20.5";
    double d1 = Double.parseDouble(s3);
    double d2 = Double.parseDouble(s4);
    System.out.println(s3+s4);
    System.out.println(d1+d2);   
  	}
}
