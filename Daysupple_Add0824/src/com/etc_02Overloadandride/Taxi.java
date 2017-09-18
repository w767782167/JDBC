package com.etc_02Overloadandride;

public class Taxi extends Car{
	
//	方法重写: Override   Car
	public void run(){
		System.out.println("Taxi   加速了...");
	}

	
	//构造方法 不能重写
	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Taxi(String brand, String color){
		super(brand,color);//调用父类的构造方法  有参数
		//super();
	}


	
	
	
}
