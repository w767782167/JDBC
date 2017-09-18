package com.etc_01randomDemo;

public class MathRandomDemo {
	public static void main(String[] args) {
		/*double random() 
        返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。*/ 
		Math.random();//类名.方法名
		
//		1-10;随机数
		//int r = (int)(Math.random()*10+1);
		for(int i=0;i<100;i++){
			int r = (int)(Math.random()*10+1);
			System.out.println(r);
		}
		
	}

}
