package com.etc._05MathDemo;

import java.math.BigDecimal;

public class Demo {
	public static void main(String[] args) {
		
//		1/3  *3 = 1
		System.out.println("0.09+0.01="+(0.09+0.01));
		System.out.println("1.0-0.33="+(1.0-0.33));
		System.out.println("4.015*1000="+(4.015*1000));
		System.out.println("12.3/100="+(12.3/100));
		
		System.out.println("----------------------------");
//		使用BigDecimal,用于处理金钱和精度要求高的数据.
		BigDecimal num1 = new BigDecimal(0.09);
		BigDecimal num2 = new BigDecimal(0.01);
		System.out.println(num1.add(num2));
		
		
//		参数使用字符串
		BigDecimal num3 = new BigDecimal("0.09");
		BigDecimal num4 = new BigDecimal("0.01");
		System.out.println(num3.add(num4));
		//num1.add(num2);
		int a = 17;
		String age =a+""; 
	}
	

}
