package com.etc._14Task_Dog;

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog("小白","黑色");
		Person p = new Person("小丽",d);
		p.playDog(9);
		p.playDog(10);
		p.playDog(11);
		
		
		p.playDog(16);
	}

}
