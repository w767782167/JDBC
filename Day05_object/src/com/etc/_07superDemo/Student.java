package com.etc._07superDemo;

public class Student extends Person {
	private String sn;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;  //当对象本身
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public void working(){
		super.working();//当前对象的父类
		System.out.println("学java.....");
	}

	//子类的构造方法 默认调用父类无参的构造方法
	public Student() {
		super(); 
		// TODO Auto-generated constructor stub
		System.out.println("Student 无参数的构造方法");
	}

	public Student(int age, String sex) {
		super(age, sex);  //super当前对象的父类对象
		// TODO Auto-generated constructor stub
		System.out.println("Student 有参数的构造方法");
	}
	
	
	
	
	
	
}
