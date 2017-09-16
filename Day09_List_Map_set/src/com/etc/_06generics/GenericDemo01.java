package com.etc._06generics;

import java.util.ArrayList;

class Apple{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "我是Apple";
	}
	
	public void  show(){
		System.out.println("我是小苹果");
	}
	
	
	
}


public class GenericDemo01 {
	
	//------泛型的使用
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Apple());//这是Apple类型
		list.add("apple");//这是String类型
		
//		for (Object object : list) {
//			System.out.println(object);
//			Apple a = (Apple)object;
//			a.show();
//		}
		
		
		//使用泛型
		ArrayList<Apple> list1 = new ArrayList<Apple>();
		list1.add(new Apple());
		list1.add(new Apple());
		
		
		
		for (Apple apple : list1) {
			apple.show();
			//System.out.println(apple);
		}
		
		
	}

}
