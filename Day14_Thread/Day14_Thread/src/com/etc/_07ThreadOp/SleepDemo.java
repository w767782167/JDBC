package com.etc._07ThreadOp;

public class SleepDemo {
	public static void main(String[] args) {
		for(int i = 0;i<10;i++){
			System.out.println("第"+(i+1)+"个");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end....");
	}

}
