package oops3;
// By using static keyword it is hiding the child class property
// It executes at the time of compile time 
class Parent{
	public static void study() {
		System.out.println("Medicine");
	}
}
class Child extends Parent{
	public static void study() {
		System.out.println("Acting");             c 
	}
}
public class MethodHidingDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.study();		
		Child c = new Child();
		c.study();		
		Parent p2 = new Child();
		p2.study();
	}
}
