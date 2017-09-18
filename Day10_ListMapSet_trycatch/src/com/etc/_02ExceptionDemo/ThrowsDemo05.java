package com.etc._02ExceptionDemo;

public class ThrowsDemo05 {
	
//	JVM
	public static void main(String[] args) throws Exception {
		try {
			int k = divide1(10, 2);
			System.out.println(k);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("======="+e.getMessage());
		}
	}
	
	public static int divide1(int num1,int num2) throws Exception {
		
		if(num2 == 0){
			throw new Exception("num2不能为0");//返回异常
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
