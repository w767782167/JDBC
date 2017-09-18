package com.etc._01Number;

public class IntegerDemo {
	
	public static void main(String[] args) {
		
		//------1.装箱：基本类型数据------>包装类对象。  集合(List map)元素必须是引用类型
		int num1 = 18;
		//方法1:
		Integer numW1 = new Integer(num1);
		
		int num2 = 28;
		//方法2:
		Integer numW2 = Integer.valueOf(num2);
		
		
		
		//------2.拆箱：包装类对象------>基本数据类型数据。
		int i = numW1.intValue();
		System.out.println("i="+i);
		int j = numW2.intValue();
		System.out.println("j="+j);
		
//		3----------自动装箱(Autoboxing)  Java5
		Integer age = 19;//编译后   Integer age = new Integer(19);
		
//		4---------自动拆箱(AutoUnboxing)
		int k = age;  //编译后    int k = age.intValue();
		System.out.println("k="+k);

		
//		int  short
		Integer num3 = 4;
		switch (num3) {
		case 3:
			
			break;

		default:
			break;
		}
	}

}
