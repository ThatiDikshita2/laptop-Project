package com.pack1;
//no need import stmt  Calc.java because these classes are in same package
public class CalcTest {

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.x);
		c.findSquare(10);
				
		//private
		//System.out.println(c.y);
	    //c.findCube(10);
	}

}
