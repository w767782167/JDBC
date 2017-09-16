package com.etc_06RegexDemo;

public class RegexDemo {
	//案例:判断一个字符串全部由数字组成
	public static boolean isNumber(String str){
		char[] arr = str.toCharArray();
		for (char c : arr) {
			if(c<'0' || c>'9'){//这是字母
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		String str = "1323rt";
		boolean isNum = isNumber(str);
		System.out.println(isNum);
		
//		正则表达式(Regex)表示表达式正确的规则:
//		主要用于(匹配判断,分割操作,替换操作(网络爬虫(Lucene))):
		String regex = "\\d{5,9}"; // \\d---->\d
		boolean isOK =  str.matches(regex);
		System.out.println(isOK);
		
//		判断是否是手机号码
		String input = "13106060283";
		String regex1 = "^1[3|4|5|7|8]\\d{9}$";
		boolean isNumber =  input.matches(regex1);
		System.out.println(isNumber);

		
	}

}
