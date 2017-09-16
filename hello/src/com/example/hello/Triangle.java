package com.example.hello;

public class Triangle implements IShape, IColor {

	@Override
	public void drawColor() {
		// TODO Auto-generated method stub
		System.out.print("黄色");
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.print("三角形");
	}

}
