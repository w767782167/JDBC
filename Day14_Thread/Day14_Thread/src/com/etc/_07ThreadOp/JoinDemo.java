package com.etc._07ThreadOp;

class JoinThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<50;i++){
			System.out.println("join"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class JoinDemo {
	
	public static void main(String[] args) {
		System.out.println("begin......");
		//创建线程
		JoinThread thread = new JoinThread();
		
		for(int i = 0;i<50;i++){
			try {
				System.out.println("main"+i);
				Thread.sleep(10);
				if(i==10){
					thread.start();  //启动线程
				}
				if(i==20){
					thread.join();//强制执行join线程    主线程要等
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("end......");
	}

}
