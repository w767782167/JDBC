package com.example.hello;

public class Circle implements IShape, IColor {

	@Override
	public void drawColor() {
		// TODO Auto-generated method stub
		System.out.print("红色");
		
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.print("圆形");
	}

	
	
	

}
