package com.pack2;

//Default member not visible in outside the packages not access
public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.x);
		c.findSquare(10);
	}
} 
//Public,Protected,Private,Default these are Access modifiers.