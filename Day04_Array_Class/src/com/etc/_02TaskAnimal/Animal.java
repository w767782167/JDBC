package com.etc._02TaskAnimal;

public class Animal {
	//1成员变量
	String type;//动物种类
	String color;
	String sex;
	double weight;
	
	//2方法
	public void showInfo(){
		System.out.println(color+"的"+sex+type+",weight="+weight);
	}

}
