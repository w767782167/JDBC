package com.etc_15Task_Car;

public class Car {
	private String name;
	private String licence;
	
	private Engine engine;
	private Lamp lamp;
	public Car(String name, String licence, Engine engine, Lamp lamp) {
		super();
		this.name = name;
		this.licence = licence;
		this.engine = engine;
		this.lamp = lamp;
	}
	
	
	public void run(){
		System.out.println(this.name+this.licence+"启动了");
		this.engine.turn();
		this.lamp.light();
		
	}
	
    public void stop(){
    	System.out.println(this.name+this.licence+"停止了");
    	this.engine.stopTurn();
		this.lamp.drak();
	}
	
	
	

}
