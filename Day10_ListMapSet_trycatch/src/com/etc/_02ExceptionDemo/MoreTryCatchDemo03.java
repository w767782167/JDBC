package com.etc._02ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 多个 tryCatch
 * @author Administrator
 *
 */
public class MoreTryCatchDemo03 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int ret = sc.nextInt();  //java.util.InputMismatchException
//		System.out.println(10/ret);//java.lang.ArithmeticException
		
		try {
			Scanner sc = new Scanner(System.in);
			int ret = sc.nextInt();  
			System.out.println(10/ret);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("必须输入Int数据类型");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("除数不能为0");
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("runtime");
		}  catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		} finally{//最终都会执行的代码,无论有没有异常.
			System.out.println("关闭资源");
			System.out.println("结束了");
		}
		
		//编译时期异常:checked异常
		//Class.forName("");
		
		
	}

}
