package com.etc._03SynchroizedDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable{
	private int num = 50;//苹果总数
	private final Lock thelock =  new  ReentrantLock();//创建锁

	private synchronized void eat(){
		thelock.lock();//加锁  进入厕所  关门
		if(num>0){//A B C
			
		    try {
		    	System.out.println(Thread.currentThread().getName()+"吃了号码为"+num+"的苹果");
				Thread.sleep(10);
				num--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				thelock.unlock();//释放锁   开门  离开厕所 
			}
			
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

public class LockDemo05 {
	public static void main(String[] args) {
		Apple3 a = new Apple3();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
		
		//StringBuffer
	}

}
