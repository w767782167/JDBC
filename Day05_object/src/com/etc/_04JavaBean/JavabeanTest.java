package com.etc._04JavaBean;

public class JavabeanTest {
	public static void main(String[] args) {
		//自己写的javaBean
		Person p = new Person();
		p.setName("jack");
		p.setAge(18);
		p.showInfo();
		
		//系统提供的Javabean
		User u = new User();
		u.setUsername("张三");
		u.setPassword(123456);
		
		//打印u  是打印u.toString()
		System.out.println(u);
		
	}

}
