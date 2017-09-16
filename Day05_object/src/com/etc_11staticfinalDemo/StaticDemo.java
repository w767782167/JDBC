package com.etc_11staticfinalDemo;

public class StaticDemo {
	public int age;  //对象变量  对象.变量名
	public static String name;//类变量  类名.变量名
	
	//静态的方法 只能调用静态的方法/变量
	//非静态的方法,可以调用静态和非静态
	public void fun01(){//对象方法
		fun02();
	}
	
    public static void fun02(){//类方法
		
	}
	
	
	
	public static void main(String[] args) {
		//对象.变量名
		StaticDemo s = new StaticDemo();
		s.age = 10;
		s.fun01();
		//s.fun02();
		
		//类名.变量名
		StaticDemo.name = "jack";
		StaticDemo.fun02();
	}

}
