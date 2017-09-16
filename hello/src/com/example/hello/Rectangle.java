package com.example.hello;

public class Rectangle implements IShape, IColor {

	@Override
	public void drawColor() {
		// TODO Auto-generated method stub
		System.out.print("黑色");
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.print("四边形");
	}

}
