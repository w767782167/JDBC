package com.etc_01randomDemo;

import java.util.Random;

public class RandomUtilDemo {
	public static void main(String[] args) {
		//1-10随机数
		
		//random.nextInt(10)//0---9
		//random.nextInt(10)+1;//1---10
		Random random = new Random();
		for(int i=0;i<100;i++){
			int r = random.nextInt(10)+1;
			System.out.println(r);
		}
		
		
	}

}
