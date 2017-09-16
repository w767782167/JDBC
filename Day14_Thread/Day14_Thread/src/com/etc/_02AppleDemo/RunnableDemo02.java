package com.etc._02AppleDemo;

class Apple implements Runnable{
	private int num = 50;//苹果总数

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<50;i++){
			if(num>0){
				System.out.println(Thread.currentThread().getName()+"吃了号码为"+num--+"的苹果");
			}
		}
	}
	
}

public class RunnableDemo02 {
	public static void main(String[] args) {
		Apple a = new Apple();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
	}

}
