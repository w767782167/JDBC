package com.etc._07superDemo;

public class Person {
	private int age;
	private String sex;
	
	//没有Set和get方法
	
	 
	
//	方法
	public void working(){
		System.out.println("工作中.....");
	}

	
	//构造方法 能不能重写?  不能
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Person 无参数的构造方法");
	}

	public Person(int age, String sex) {
		super();
		this.age = age;
		this.sex = sex;
		
		System.out.println("Person 有参数的构造方法");
	}
	
	
}
