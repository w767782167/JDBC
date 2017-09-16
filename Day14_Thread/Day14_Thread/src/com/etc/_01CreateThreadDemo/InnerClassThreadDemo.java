package com.etc._01CreateThreadDemo;
/**
 * 匿名内部类实现多线程
 * 
 * 一般是这个类只使用一次
 * @author Administrator
 *
 */

public class InnerClassThreadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0;i<500;i++){
			System.out.println("打游戏"+i);
			Thread.sleep(500);
			
			if(i == 2){
				//创建新的线程  启动线程
//				new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						for(int j = 0;j<500;j++){
//							System.out.println("听音乐"+j);
//							try {
//								Thread.sleep(500);
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//						}
//						
//					}
//				}).start();
				
				
				new Thread(){
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						//super.run();
						for(int j = 0;j<500;j++){
							System.out.println("听音乐"+j);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					
				}.start();
				
			}
		}
	}

}
