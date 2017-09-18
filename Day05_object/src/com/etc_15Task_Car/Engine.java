package com.etc_15Task_Car;

public class Engine {
	private String model;
	private float capacity;
	public Engine(String model, float capacity) {
		super();
		this.model = model;
		this.capacity = capacity;
	}
	
	public void turn(){
		System.out.println("型号:"+this.model+"排量:"+this.capacity+"引擎转动了");
	}
	public void stopTurn(){
		System.out.println("型号:"+this.model+"排量:"+this.capacity+"引擎停止转动了");
	}
	
	
	

}
