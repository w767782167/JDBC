package com.etc._12singleInstance;

public class Apple {
	
	public static Apple  apple = null; //懒汉
	
	private Apple(){
		
	}
	
	public static Apple getInstance(){
		if(apple==null){
			apple = new Apple();
		}
		return apple;
	}

}
