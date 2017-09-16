package com.etc_03StringDemo;

public class StringDemo02 {
	public static String getOOXX() {
		return "AB";
	}
	
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "A"+"B"+"C"+"D";
		String str3 = "AB"+"CD";
		String temp = "AB";
		String str4 = temp+"CD";
		String str5 = getOOXX()+"CD";
		String str6 = new String("ABCD");
		String str7 = new String("ABCD");
		System.out.println(str6==str7);
		
		
		System.out.println(str1==str2);//true  
		System.out.println(str1==str3);//true  
		//编译后优化
		
		System.out.println(str1==str4);//false
		System.out.println(str1==str5);//false
		System.out.println(str1==str6);//false
		
		
	}

}
