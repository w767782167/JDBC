package com.etc._06LifeDemo;


class XXX extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}


public class Demo {
	public static void main(String[] args) {
		XXX xxx = new XXX();
		xxx.start();//-----run()
		xxx.start();
	}

}
