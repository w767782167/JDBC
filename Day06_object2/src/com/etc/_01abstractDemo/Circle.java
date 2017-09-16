package com.etc._01abstractDemo;

public class Circle extends Graph{
	private double r;
	
	

	public Circle(double r) {
		super();
		this.r = r;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}
	

}
