package com.etc_03StringDemo;

import java.util.Arrays;

public class StringTask04 {
	
	public static void main(String[] args) {
//		1、	String str = “willabcde”  首字母大写
		String str = "willabcde";//---->Willabcde
		
		//截取
//	    System.out.println(str.substring(2));//开始位置    到  结束
//	    System.out.println(str.substring(2,5));开始位置   到  结束位置
		String firstchar = str.substring(0, 1);
		System.out.println(firstchar);
		firstchar = firstchar.toUpperCase();
		System.out.println(firstchar);
		
		String newStr = firstchar+str.substring(1);
		System.out.println(newStr);
		
//	    2、	获取以hello开头的文件名的后缀名
//		String filenames = “abc.java;hello.will.txt;hello.java;hello.classs“;
		
		String filenames = "abc.java;hello.will.txt;hello.java;hello.classs";
		
		//字符串----->数组
		String[] arr = filenames.split(";");
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------");
		for (String string : arr) {
			//System.out.println(string);
			if(string.contains("hello")){
				//System.out.println(string);
				int index = string.lastIndexOf(".");
				//System.out.println(index);
				
				System.out.println(string.substring(index));
			}
		}

	}

}
