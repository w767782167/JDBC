package com.example.hello;

import java.util.Random;
import java.util.Scanner;

public class TestShape {
	//static变量, 只要程序在运行,它就存在, 
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Object[] objs = new Object[10];
		
		Random rand = new Random();
		for(int j=0;j<objs.length;j++){//随机产生形状和颜色,放入到数组objs中
			int i = rand.nextInt(3);
			switch(i){
			case 0:
				 objs[j] = new Rectangle();
				break;
			case 1:
				objs[j] = new Circle();
				break;
			case 2:
				objs[j] = new Triangle();
				break;
			}
		}
		
		for(int j=0;j<objs.length;j++){
			IShape shape = (IShape)objs[j];
			shape.drawShape();
			IColor color = (IColor)objs[j];
			color.drawColor();
			System.out.println();
			
		}
	}

}
