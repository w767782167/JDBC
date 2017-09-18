package com.etc_03InterfaceDemo;

public class Frog extends Animal implements IWalkable,ISwimable{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("swim");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk  跳~~~~");
	}

}
