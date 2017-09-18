package com.etc._01CreateThreadDemo;

class BoilWater1 implements Runnable{//烧水类

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("正在烧水....");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("烧水结束....");
		
	}
}


class WashCup1 implements Runnable{//洗杯子类
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++){
			System.out.println("洗杯子第"+(i+1)+"个");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class RunableDemo02 {
	
	public static void main(String[] args) {
		BoilWater1 bw1 = new BoilWater1();
		
		WashCup1 wc1 = new WashCup1();
		
		Thread t1 = new Thread(bw1);
		t1.start();
		
		//new Thread(bw1).start();
		Thread t2 = new Thread(wc1);
		t2.start();
		
		
	}

}
