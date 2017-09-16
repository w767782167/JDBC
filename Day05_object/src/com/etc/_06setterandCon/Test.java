package com.etc._06setterandCon;

public class Test {
	public static void main(String[] args) {
		
		User u = new User("jack",888888);
		System.out.println(u);
		
		Person p = new Person();
		p.setName("tom");
		p.setAge(18);
		p.setSex("男");
		System.out.println(p);
		
		
		
	}

}
