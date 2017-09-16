package com.etc_02Overloadandride;

public class Test {
	public static void main(String[] args) {
		Taxi t = new Taxi("宝马","红色");
		t.brake();
		t.run();
		
		System.out.println(t);
	}

}
