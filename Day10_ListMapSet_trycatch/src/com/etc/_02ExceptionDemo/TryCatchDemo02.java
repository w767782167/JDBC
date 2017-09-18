package com.etc._02ExceptionDemo;
/**
 * 异常处理  try---catch
 * @author Administrator
 *
 */


public class TryCatchDemo02 {
	public static void main(String[] args) {
		System.out.println("begin....");
		
		try {
			int ret = 10/0;//if---else
			System.out.println(ret);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
//			1.getMessage()  需要 syso
			//System.out.println("e.getMessage() = "+e.getMessage());
//			2.e.toString()  需要syso  toString()可以不写
			//System.out.println(e);//输出  默认就调用toString()
			//System.out.println(e.toString());
			
//		   3.	e.printStackTrace();   不需要syso  自己打印输出
			e.printStackTrace();
			
			System.out.println("异常来了.......");
		}
		System.out.println("end....");
//		System.err.println("XXXXXX");  打印红色  一般不使用
	}

}
