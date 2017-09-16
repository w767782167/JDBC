package com.etc._01abstractDemo;

//抽象类
public abstract class Graph {
	private String type;
	
	public void show(){
		System.out.println("show");
	}
	
//	public abstract double getArea(){
//		
//	};
	
	//抽象方法
	public abstract double getArea();
	

}
