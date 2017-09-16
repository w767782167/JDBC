package com.etc_03InterfaceDemo;

public class Test {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.walk();
		
		IWalkable c1 = new Cat();
		c1.walk();
		
//		Animal c2 = new Cat();
//		c2.walk();
		
		
		Frog f = new Frog();
		f.walk();
	}

}
