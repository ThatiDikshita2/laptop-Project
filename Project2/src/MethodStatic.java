
public class MethodStatic {

	public static int findsum(int x,int y) {
		return x+y;
	}
	
	public static void greet()
	{
		System.out.println("Hello Everybody!");
		
	}	
	 public static double findmax(double x, double y) {
		 return(x>y)? x:y;
	 }
	
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
       int total=findsum(10,20);
       System.out.println(total);
       System.out.println(findsum(200,300));
       System.out.println(findsum(20000,4000));
       greet();
        
      double max=findmax(125.4, 130.5);
       System.out.println(max);    
	}
}
