package com.etc._08Task_Admin;

import java.util.Scanner;

/*
•定义一个管理员类:  
•显示管理员信息的方法:返回管理员用户名和密码的信息; 
•验证用户密码的方法:传入用户名和密码的参数，
返回布尔类型，用户名和密码是否正确。 
•编写一个测试类，创建一个管理员类，
初始化设置用户名和密码，控制台接收用户输入的用户名和密码
，调用验证的方法，显示是否登录成功。*/


public class AdminTest {
	public static void main(String[] args) {
		
		Admin a = new Admin();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = sc.next();
		
		System.out.println("请输入密码");
		String password = sc.next();
		
		//方法调用
		if(a.isValidate(username, password)){
			a.showInfo();
		}else{
			System.out.println("输入有错误");
		}
		
	}

}
