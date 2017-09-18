package com.etc._02AppleDemo;

class Person extends Thread{
	private int num = 50; //苹果的总数
	
	Person(String name){
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i = 0;i<50;i++){
			if(num>0){
				System.out.println(super.getName()+"吃了号码为"+num--+"的苹果");
			}
		}
	}
	
}


public class ExtendsThreadDemo {
	
	public static void main(String[] args) {
		new Person("小A").start();//50
		new Person("小B").start();//50
		new Person("小C").start();//50
		
	}

}
