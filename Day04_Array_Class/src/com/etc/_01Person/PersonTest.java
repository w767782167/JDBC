package com.etc._01Person;
/**
 * 对象创建
 * @author Administrator
 *
 */

public class PersonTest {
	
	public static void main(String[] args) {
//		1创建对象
		Person p1 = new Person();
		
		//设置
		p1.name = "东方菇凉";
		
		//获取
		String tempName = p1.name;
		System.out.println(tempName);
		
		//调用方法
//		static  类名.方法名
//		没有static  对象名.方法名
		p1.shopping();
		p1.showInfo();
		
		
		Person p2 = new Person();
		p2.name = "jack";
		p2.age = 18;
		p2.showInfo();
		
		Person p3 = new Person();
		p3.name = "zhangsan";
		
		
		p3 = p2;
		p3.showInfo();
		
		p3 = null;
		//java.lang.NullPointerException
		System.out.println(p3.name);
		
	}

}
