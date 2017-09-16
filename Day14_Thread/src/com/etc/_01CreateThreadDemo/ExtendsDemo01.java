package com.etc._01CreateThreadDemo;


class BoilWater extends Thread{//烧水类
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


class WashCup extends Thread{//洗杯子类
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



public class ExtendsDemo01 {
	
	//主线程
	public static void main(String[] args) {
		BoilWater bw = new BoilWater();
		bw.start();
		WashCup wc = new WashCup();
		wc.start();
		
		//一定要调用start方法
		
	}

}
