package com.etc_03StringDemo;

import com.etc_04Util.StringUtil;

public class StringDemo01 {
	public static void main(String[] args) {
		
		//不可变的字符串String
		String str = "丽丽";
		System.out.println(str);
		str = "张三";//这时 str是一个新的地址
		System.out.println(str);
		
		
		String str1 = new String("ABCD");
		String str2 = "ABCD";
		
		if(str1==str2){
			System.out.println("地址一样");
		}
		
		if(str1.equals(str2)){
			System.out.println("内容一样");
		}
		
		
		
		System.out.println(str1);
		
		//判断字符串非空
		String str3 = null;//缺考
		String str4 ="";//考0分
		String str5 =" ";
	
		
		String str6 =" AB";
//		trim() 返回字符串的副本，忽略前导空白和尾部空白。
		System.out.println(str6);
		str6.trim();
		System.out.println(str6.trim());
		
		if(str6.equals(str6.trim())){
			System.out.println("trim一样");
		}
		
		
		String str7 = "A";
		if(str7!=null && !"".equals(str7.trim())){
			System.out.println("字符串非空");
		}else{
			System.out.println("字符串为空");
		}
		
//		if(!"".equals(str7.trim()) && str7!=null){
//			System.out.println("字符串非空");
//		}else{
//			System.out.println("字符串为空");
//		}
		
		System.out.println(hasLength(str7));
		
//		StringUtil strUtil = new StringUtil();
		
		
		StringUtil.hasLength("hello");
		
		
		
		
	}
	
	
	public static boolean hasLength(String str){
//		if(str!=null && !"".equals(str.trim())){
//			return true;
//		}else{
//			return false;
//		}
		
//		
//		if(str!=null && !"".equals(str.trim())){
//			return true;
//		}
//	    return false;
		
		
		
		return str!=null && !"".equals(str.trim());
		
		
		
	}

}
