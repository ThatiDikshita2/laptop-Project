package java8features;

@FunctionalInterface
interface MyFunctionalinterface{
	void greet();
}
@FunctionalInterface
interface MyFunctionalinterface2{
	int findSquare(int num);
}
public class LambdaExpressions {
	public static void main(String[] args) {
		
		 MyFunctionalinterface2 myFun2 = (int num)-> num* num;
	   	 int square = myFun2.findSquare(10);		 
		 System.out.println(square);
		 
	    MyFunctionalinterface myFun = ()-> System.out.println("Hello...");
         myFun.greet();
	}
}
