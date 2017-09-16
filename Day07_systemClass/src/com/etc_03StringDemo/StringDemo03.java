package com.etc_03StringDemo;

public class StringDemo03 {
	/*1):String的创建和转换:
		byte[] getBytes():把字符串转换为byte数组
		char[] toCharArray():把字符串转换为char数组
		String(byte[] bytes):把byte数组转换为字符串
		String(char[] value):把char数组转换为字符串
		*/
	public static void buildString(){
		
		//.1.char数组----->字符串
		char[] values = {'A','B','C'};
		String str = new String(values);
		System.out.println(str);
		
		//2.字符串----->char数组
		char[] newArray = str.toCharArray();
		System.out.println(newArray);
		
		
		//3.byte[]----->字符串
		
		System.out.println("ABCD".getBytes()); //字符串--->byte[]
		
		System.out.println(new String("ABCD".getBytes())); //byte[]---->字符串
		
		
		
	}
	
	
	/*2):获取字符串信息
	int length() 返回此字符串的长度 
	char charAt(int index) 返回指定索引处的 char 值 
	int indexOf(String str)返回指定子字符串在此字符串中第一次出现处的索引。 
	int lastIndexOf(String str)返回指定子字符串在此字符串中最右边出现处的索引 */
	
	public static void getStringInfo(){
		String str = "AB中";
		System.out.println(str.length());
		
		System.out.println("ABCD".charAt(3));
		
		String str1 = "A,BC,D";
		int index = str1.indexOf(",");
		System.out.println(index);
		int lastIndex = str1.lastIndexOf(",");
		System.out.println(lastIndex);
		
		
		
	}
	
	/*3):字符串比较判断
	boolean equals(Object anObject) 将此字符串与指定的对象比较。 
	boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写
	boolean contentEquals(CharSequence cs) 将此字符串与指定的 CharSequence 比较*/
	
	public static void equalString(){
		String str1 = "abc";
		String str2 = "ABC";
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("str1 = str2");
		}
	}
	
	
	/*4):字符串大小写转换
	String toUpperCase()  把当前字符串转换为大写(谁调用该方法,谁就是当前字符)
	String toLowerCase()  把当前字符串转换为小写*/
	
	public static void upperAndLower(){
		String str1 = "abc";
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println(str1);
		
		str1 = str1.toLowerCase();
		System.out.println(str1);
	}



	
	
	
	

	
	public static void main(String[] args) {
		//buildString();
		
		//getStringInfo();
		
		
		//equalString();
		
		upperAndLower();
	}

}
