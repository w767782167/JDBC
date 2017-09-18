package com.etc._02TaskAnimal;

public class AnimalTest {
	/*1、定义一个类，"动物",定义属性，方法，
	通过代码实现输出某种动物的基本信息(能调用方法来输出);*/
	public static void main(String[] args) {
//		创建对象
		Animal a = new Animal();
		a.type = "鸡";
		a.color = "黄色";
		a.sex = "母";
		a.weight = 3;
		
		a.showInfo();
	}
}
