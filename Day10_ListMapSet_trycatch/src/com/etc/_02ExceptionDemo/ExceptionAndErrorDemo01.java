package com.etc._02ExceptionDemo;
/**
 * 异常和错误
 * @author Administrator
 *
 */

class TT{
	public int run() {
		return run();
	}
}


public class ExceptionAndErrorDemo01 {

	public static void main(String[] args) {
		//--------    一.Error
//		new TT().run();
//		1.java.lang.StackOverflowError  
		//当应用程序递归太深而发生堆栈溢出时，抛出该错误。
		
		//-------     二.Exception
		
//		int ret = 10/0;
//		System.out.println(ret);
		
//		2. java.lang.ArithmeticException
		//当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例
		
		
//		int[] arr = {1,3,4};
//		int i = arr[5];
		
//		3.java.lang.ArrayIndexOutOfBoundsException
//		用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。
		
		String str = null;
		System.out.println(str.length());
		
//		4.java.lang.NullPointerException
//		当应用程序试图在需要对象的地方使用 null 时，抛出该异常
		
	}

}
