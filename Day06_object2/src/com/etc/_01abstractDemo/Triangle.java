package com.etc._01abstractDemo;

public class Triangle extends Graph {
	private double di;
	private double gao;
	
	

	public Triangle(double di, double gao) {
		super();
		this.di = di;
		this.gao = gao;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (di*gao)/2;
	}

}
