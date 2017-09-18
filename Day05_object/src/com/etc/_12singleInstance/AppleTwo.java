package com.etc._12singleInstance;

public class AppleTwo {
 
	public static AppleTwo  apple = new AppleTwo(); //饿汉    
	
	private AppleTwo(){
		
	}
	
	public static AppleTwo getInstance(){
		
		return apple;
	}

}
