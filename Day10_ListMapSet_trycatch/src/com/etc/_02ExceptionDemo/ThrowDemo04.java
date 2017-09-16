package com.etc._02ExceptionDemo;

public class ThrowDemo04 {
	public static void main(String[] args) {
		try {
			int k = divide1(10, 2);
			System.out.println(k);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("======="+e.getMessage());
		}
	}
	
	public static int divide1(int num1,int num2){
		
		if(num2 == 0){
			throw new ArithmeticException("num2不能为0");//返回异常
//			return  "num2不能为0";  返回值
		}
		
		try {
			int ret = num1/num2;
			System.out.println("结果:"+ret);
			return ret;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return 0;
	}

}
