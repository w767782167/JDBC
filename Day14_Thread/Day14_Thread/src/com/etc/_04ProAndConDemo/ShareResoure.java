package com.etc._04ProAndConDemo;
/**
 * 共享资源
 * @author Administrator
 *
 */

public class ShareResoure {
	private String name;
	private String gender;
	private boolean isEmpty = true;//表示共享资源是否为空
	
	//生产者给共享资源数据
	public synchronized void push(String name,String gender){
		
		try {
			//this 生产者
//			if(!isEmpty){//false  共享资源不为空  不用生产了
//				this.wait();   //生产者睡觉
//			}
			
			
			while(!isEmpty){//false  共享资源不为空  不用生产了
				this.wait();   //生产者睡觉
			}
		
			//开始生产
			this.name = name;
			Thread.sleep(100);
			this.gender = gender;
			//生产结束
			isEmpty = false;
			
			this.notify();//生产者叫消费者来消费
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//消费者从共享资源拿数据
	public synchronized void pop(){
		
		try {
			
			//this  是消费者
//			if(isEmpty){  //ture  共享资源为空  不用消费了
//				this.wait(); //消费者睡觉
//			}
			while(isEmpty){  //ture  共享资源为空  不用消费了
				this.wait(); //消费者睡觉
			}
			
			//开始消费
			System.out.println(this.name+"-------"+this.gender);
			Thread.sleep(100);
			//消费结束
			isEmpty = true;
			
			this.notify();//消费者叫生产者来生产
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
