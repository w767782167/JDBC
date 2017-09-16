package com.etc._03SynchroizedDemo;

class Apple1 implements Runnable{
	private int num = 50;//苹果总数

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 50; i++) {

			synchronized (this) {
				if (num > 0) {

					System.out.println(Thread.currentThread().getName()
							+ "吃了号码为" + num + "的苹果");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					num--;
				}
			}
		}

	}
	
}

public class SynchronizedBlockedDemo02 {
	public static void main(String[] args) {
		Apple1 a = new Apple1();
		new Thread(a,"小A").start();
		new Thread(a,"小B").start();
		new Thread(a,"小C").start();
	}

}
