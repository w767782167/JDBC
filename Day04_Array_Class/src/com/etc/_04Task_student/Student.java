package com.etc._04Task_student;

public class Student {
	//成员变量
    String name;
    int age;
	boolean isFee = false;
	
	//方法
	void fees(){
		isFee = true;
	}
	
	//自定义构造方法
	//无参数
	public Student(){
		
	}
	
	//一个参数
    public Student(String name){
    	//this当前对象本身
		this.name = name;
	}
    
//    多个参数
    public Student(String name,int age){
    	//this当前对象本身
		this.name = name;
		this.age = age;
	}
    
    
    public void showInfo(){
    	System.out.println("name="+name+",age="+age);
    }


}
