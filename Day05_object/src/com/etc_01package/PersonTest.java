package com.etc_01package;
/**
 * 封装
 * @author Administrator
 *
 */

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
//		p.name = "张三";
//		p.age = -18;
//		int age = -18;
//		if(age>0){
//			p.age = age;
//		}else{
//			System.out.println("年龄不科学");
//		}
		
		//设置年龄
		p.setAge(-18);
		p.showInfo();
		
		
		Person p1 = new Person();
//		p1.name = "张三";
//		int age1 = -18;
//		if(age1>0){
//			p1.age = age1;
//		}else{
//			System.out.println("年龄不科学");
//		}
		
		
		
	}

}
