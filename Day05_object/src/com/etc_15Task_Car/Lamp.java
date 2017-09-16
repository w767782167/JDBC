package com.etc_15Task_Car;

public class Lamp {
	private int wattage;//瓦数
	
	
	public Lamp(int wattage) {
		super();
		this.wattage = wattage;
	}
	
	public void light(){
		System.out.println(this.wattage+"瓦数的车灯亮了");
	}
	public void drak(){
		System.out.println("车灯熄灭了");
	}

}
