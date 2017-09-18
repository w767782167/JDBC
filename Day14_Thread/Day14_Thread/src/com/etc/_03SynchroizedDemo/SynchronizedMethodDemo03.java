package com.etc._03SynchroizedDemo;

class Apple2 implements Runnable{
	private int num = 50;//苹果总数

	private synchronized void eat(){
		if(num>0){//A B C
			System.out.println(Thread.currentThread().getName()+"吃了号码为"+num+"的苹果");
		    try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			num--;
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<50;i++){
			eat();
		}
	}
	
}

public class SynchronizedMethodDemo03 {
	public static void main(String[] args) {
		Apple2 a = new Apple2();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
		
		//StringBuffer
	}

}
