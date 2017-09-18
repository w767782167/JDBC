package com.etc_03InterfaceDemo;

public class Cat  extends Animal implements IWalkable{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("猫  步");
	}

}
