package com.etc._02Inheritance;


//这是父类  Object
public class Person {
	private String name;
	private int age;
	
	//set/get
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public void sleep(){
		System.out.println("sleep");
	}

}
