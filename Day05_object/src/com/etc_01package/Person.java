package com.etc_01package;

//private 是封装的一种形式
//封装只是一种思想
public class Person {
//	public String name;
//	public int  age;
	
	private String name;
	private int  age;
	
	//getter/setter方法
	
	//设置年龄
	public void setAge(int age){
		if(age>0){
			this.age = age;
		}else{
			System.out.println("年龄不科学");
		}
		
	}
	
	//获取年龄
	public int getAge(){
		return this.age;
	}
	
	
	public void showInfo(){
		System.out.println("name = "+name+",age="+age);
	}
	
	

}
