package com.etc_01Method;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		//方法的调用     对象.方法名   没有static
		p.loving();
		p.loving("如花");
		
		String lovingName = p.lovingName();
		System.out.println(lovingName);
		
		String tempString = p.loving("如花", 4);
		System.out.println(tempString);
		
		
//		类名.方法名  static
		Person.loving1();
		
	}

}
