package com.etc_02Overloadandride;

public class Car {
	private String brand;//品牌
	private String color;//颜色
	
	//方法重载: Overload
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}
	
	
	
	//1 get/set  都可以给brand color赋值
	//2  构造器       都可以给brand color赋值
	
	
	//方法  行为  函数  功能
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + "]";
	}
	public void brake(){
		System.out.println("汽车刹车了...");
	}
	
	public void run(){
		System.out.println("汽车加速了...");
	}
	
	
	
	

}
