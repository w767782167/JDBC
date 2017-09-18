package com.etc._02Inheritance;

//extends 表示继承

public class Student extends Person{
	private String sn;//学号
	//get/set
	public void setSn(String sn){
		this.sn = sn;
	}
	
	public String getSn(){
		return this.sn;
	}
	
	public void showInfo(){
		System.out.println("name="+getName());
	}
	

}
