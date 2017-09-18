package com.example.hello;

import java.util.Random;
import java.util.Scanner;

public class Test {
	//static变量, 只要程序在运行,它就存在, 
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h = new Hello();
		System.out.println( h.getName() );
		h = new Hello("hello");
		System.out.println( h.getName() );
		System.out.print( "请输入一个整数:" );
		//int i = scan.nextInt();
		//System.out.println( "i = " + i );
		
		//java类型; boolean, long, int ,  short, byte, double, float, char
		//长度                       1        8    4        2     1     8       4      1
		
		//数组
		int[] x = {1, 2,3};
		int[] y = new int[10];
		for(int i=0;i<y.length;i++){
			y[i]=10;
		}
		for(int k: y){
			System.out.println(k);
		}
		Hello[] hs = new Hello[10];//new出来数组, 但数组中的元素并没有new出来
		for(int i=0;i<y.length;i++){
			hs[i]= new Hello();
		}
		for(Hello b: hs){
			System.out.println(b);
		}
		//System.currentTimeMillis(): 1970.1.1零点开始, 到现在经过的毫秒数
		System.out.println( System.currentTimeMillis() );
		Random rand = new Random( System.currentTimeMillis() );//建立一个伪随机数产生器.
		int r = rand.nextInt(10);
		System.out.println(r);
		
		float f = rand.nextFloat();//0.0 ~ 1.0之间
		System.out.println(f);
		
		//统计一个运算花费的时间
		Long start = System.currentTimeMillis();
		for(long i=0;i<100000000;i++){
			Hello hh = new Hello();
		}
		Long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
	}

}
