package com.etc_01Method;

public class Person {
	//成员变量
	private String  name;
	
	//方法 行为  函数  功能   定义
	//a:无参数无返回，
	public void loving(){ //static
		System.out.println("正在恋爱中.....");
	}
	
	public static void loving1(){ //static
		System.out.println("Static   正在恋爱中.....");
	}
	
//	b:有参数无返回
	public void loving(String grilName){ //static
		System.out.println("正在跟"+grilName+"恋爱中.....");
	}
	
	
//	，c:无参数有返回，
	
	public String lovingName(){ //static
		return "小丽";
	}
	
	
//	d:有参数有返回
	public String loving(String grilName,int time){ //static
		if(time>3){
			return "boy";
		}else{
			return grilName;
		}
	}
	
	
	

}
