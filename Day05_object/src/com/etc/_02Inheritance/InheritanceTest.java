package com.etc._02Inheritance;
/**
 * 继承
 * @author Administrator
 *
 */

class Animal{
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}


public class InheritanceTest { 
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(18);//父类的
		stu.setName("jack");//父类的
		stu.setSn("110");//自己的
		stu.showInfo();//自己的
		stu.sleep();//父类的
		
		
		//父类引用指向子类对象
		Animal d = new Dog();
		Animal c = new Cat();
		
		//Dog d = new Animal();
		
	}

}
