package com.etc._03SynchroizedDemo;

class User{
	private User(){
		
	}
	//单例模式  -----饿汉
//	private static final User instance = new User();
//	public static User getInstance(){
//		return instance;
//	}
	
	
//	单例模式-----懒汉
//	private static User instance = null;
//	public static User getInstance(){ //线程不安全
//		if(instance == null){
//			instance = new User();
//		}
//		return instance;
//	}
	
	//方式1    同步方法
//	private static User instance = null;
//	public synchronized static User getInstance(){ 
//		if(instance == null){
//			instance = new User();
//		}
//		return instance;
//	}
	
	
	//方式2  同步代码块
	private static User instance = null;
	public static User getInstance(){ 
		synchronized (User.class) {
		   if(instance == null){
				instance = new User();
			}
		}
		return instance;
	}
}


public class SingleInstanceDemo04 {
	public static void main(String[] args) {
		User.getInstance();
		User.getInstance();
		User.getInstance();
	}

}
