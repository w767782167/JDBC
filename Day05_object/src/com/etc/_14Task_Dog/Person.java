package com.etc._14Task_Dog;

public class Person {
	private String name;
	//组合  包含
	private Dog dog;
	public Person(String name, Dog dog) {
		super();
		this.name = name;
		this.dog = dog;
	}
	
	
	public void playDog(int time){
		switch (time) {
		case 9:
            this.dog.run();
			break;
		case 10:
			 this.dog.playball();
			break;
		case 11:
			this.dog.loud();
			break;

		default:
			System.out.println("不玩了.....");
			break;
		}
		
	}
	

}
