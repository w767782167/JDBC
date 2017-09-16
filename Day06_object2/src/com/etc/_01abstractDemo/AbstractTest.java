package com.etc._01abstractDemo;
/**
 * 抽象
 * @author Administrator
 *
 */


public class AbstractTest {
	
	//public abstract void doWork();
	
	public static void main(String[] args) {
		
		//Graph g = new //Graph();//抽象类不能创建实例
		
		Circle c = new Circle(4.0);
		double area1 = c.getArea();
		System.out.println(area1);
		
		Triangle t = new Triangle(4.0,5.0);
		double area2 = t.getArea();
		System.out.println(area2);
		
	}

}
