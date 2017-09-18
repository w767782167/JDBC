package com.etc._01Number;

public class NumberDemo {
	public static void main(String[] args) {
		int size = Double.SIZE;
		System.out.println(size);
		
		System.out.println(Float.TYPE);
		
		
		//--------1.String---->包装类
		String str = "123";
		
		Integer num1 = Integer.valueOf(str);
		System.out.println(num1);
		
		//------2.包装类------>String
		String temp = num1.toString();
		System.out.println(temp);
		
		
		//------3.基本数据类型------>字符串
		int age = 18;
		String str1 = age+"";
		System.out.println(str1);
		
		//-----4.字符串------>基本数据类型
		String str2 = "345";
		int j = Integer.parseInt(str2);
		System.out.println(j);
		
		
		//Double.parseDouble(s)
		
		Boolean b = new Boolean("1234");
		System.out.println(b);
		
		
		
		
	}

}
