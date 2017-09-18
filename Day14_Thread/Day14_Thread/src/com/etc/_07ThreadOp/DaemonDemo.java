package com.etc._07ThreadOp;
/**
 * 后台线程
 * @author Administrator
 *
 */

class DaemonThread extends Thread{
//	前台线程创建的线程       默认是前台线程
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<500;i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(super.getName()+"------"+i+"---"+Thread.currentThread().isDaemon());
		}
	}
}


public class DaemonDemo {
	public static void main(String[] args) {
		//Thread.currentThread().setDaemon(true);  主线程 不能设置为后台线程
		
		System.out.println(Thread.currentThread().isDaemon());//当前线程  == 主线程
	    for(int i = 0;i<50;i++){
	    	System.out.println("main"+i);
	    	try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	if(i==10){
	    		DaemonThread dt = new DaemonThread();
	    		
	    		//设置为后台线程
	    		dt.setDaemon(true);
	    		
	    		dt.start();
	    		
	    	}
	    	 
	    }
	   
	}
	

}
