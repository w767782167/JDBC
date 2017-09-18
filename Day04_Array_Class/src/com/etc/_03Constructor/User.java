package com.etc._03Constructor;

public class User {
	String name;
	//无参数
	public User(){
		System.out.println("User()");
	}
//	
//	public void User(){
//		
//	}
	
//    private User(){
//		
//	}
	
	//带参数
	public User(String name){
		System.out.println(name);
		this.name = name;
	}

}
