package com.etc_05ClassDemo;

import java.lang.reflect.Field;

public class ClassDemo {
	
	public static void main(String[] args) throws Exception {
//		创建Class类型的对象  反射
//		方法1:
	  Class c =	String.class;
	  
//	  方法2:
	  Class a = Class.forName("com.etc_05ClassDemo.Apple");
	  //获取对象的属性
	  Field[] fields = a.getDeclaredFields();
	  for (Field field : fields) {
		System.out.println(field.getName());
	  }
	  
	  //获取Class的真实对象
	  Object object = a.newInstance();
	  if(object instanceof Apple){
		  //System.out.println("Yes, Apple");
		  Apple a1 = (Apple)object;
		  System.out.println(a1);
		 
		  
		  
		  /*
		  //int ---double 
		  int i = 10;
		  double j = i;
		  //double ---->int
		  double k = 10.34;
		  int h =(int) k;
		  */
	  }
		
	}

}
