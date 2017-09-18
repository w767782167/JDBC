package com.example.hello;

public class Hello {
	//public, 在哪里都可以使用
	//private ,  在类外部看不到, 所以在类外部不可以调用
	private String name; //类的属性, 类的成员变量, 当对象存在时, 成员变量就存在
	
	public Hello(){//构造方法
		name="unknown";
	}
	
	
	
	@Override
	public String toString() {
		return "Hello [name=" + name + "]";
	}



	public Hello(String name){
		this.name = name; // this, 表示对象自己
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {//程序运行的起点
		// TODO Auto-generated method stub
		//h: Hello类的对象, main方法的局部变量. h仅在main方法运行时存在
		Hello h = new Hello();//新建对象, 使用new
		h.name ="java";
		System.out.println("hello " + h.name);//调试, 使用System.out.println
		System.out.println(args.length);
		
		for(String s: args){//args: 表示集合或数组. 从集合或数组取出元素, 存放在零时变量s中
			System.out.println(s);
		}
		
		
	}

}
