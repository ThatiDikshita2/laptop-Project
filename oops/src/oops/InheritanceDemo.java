package oops;
 //Inheritance- To extends one class from another in order to reuse the functionality 
public class InheritanceDemo {
// To Stop the inheritance of the child class by final class  not over to child class
	//  we cannot create a child class for string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.call();
		p.msg();
		
		System.out.println(".........");
        Smartphone sp= new Smartphone();
        sp.call();
        sp.msg();
        sp.browsing();
	}

}