package com.etc_03StringDemo;

public class StringChangeDemo05 {
//	分别使用String/StringBuilder/StringBuffer来拼接30000次字符串,对比各自损耗的时间
	
	public static void testString(){
		
		long begintime = System.currentTimeMillis();
		String str = "";
		for(int i=0;i<30000;i++){
			str += i;
		}
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-begintime);
	}
	
	
	public static void testStringBuilder(){
		
		long begintime = System.currentTimeMillis();
		StringBuilder str = new StringBuilder(""); //创建一个可变空的字符串
		for(int i=0;i<30000;i++){
			str.append(i);
		}
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-begintime);
	}
	
	
    public static void testStringBuffer(){
		
		long begintime = System.currentTimeMillis();
		StringBuffer str = new StringBuffer(""); //创建一个可变空的字符串
		for(int i=0;i<30000;i++){
			str.append(i);
		}
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-begintime);
	}
	
	
	public static void main(String[] args) {
		
		//testString();
		
		//testStringBuilder();
		
		//testStringBuffer();
		
//		append(Object val):表示追加任意类型数据
//		StringBuilder deleteCharAt(int index)  :删除字符串中,指定位置的字符
		
		
//		AbstractStringBuilder  AbstractStringBuilder
		
	
		
//		Math
		
		//同一个地址   内容可以改变
		StringBuilder sb1 = new StringBuilder("abc");
		//a.追加任意类型数据
		System.out.println(sb1);
		sb1.append("def");
		System.out.println(sb1);
		sb1.append("e");
		System.out.println(sb1);
		//b.删除
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		
		
		
		
//		StringBuilder sb1 = "abc";
		
//		String str = new String("abc");
//		String str1 = "abc";//只有不可变,才能这样写
		
		
		//每次都是不同的地址  都是新的对象
		String str = "abc";
		str = str+"def";
		str = str+"e";

		
	}

}
