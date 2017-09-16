package com.etc_06enumDemo;

public class Test {
	public static void main(String[] args) {
//		Employee em = new Employee();
//		em.setRestday(13000);  
//		//int  1.类型不安全  2.业务含义不明确
//		if(em.getRestday() == WeekDays.Saturday || em.getRestday() == WeekDays.Sunday){
//			System.out.println("周末休息");
//		}else{
//			System.out.println("周末不休息");
//		}
		
		Employee em = new Employee();
		em.setRestday(WeekDays.Wednesday);
		//WeekDays day =  new WeekDays();
		//em.setRestday(new WeekDays()); 
		//int  1.类型不安全  2.业务含义不明确
		if(em.getRestday() == WeekDays.Saturday || em.getRestday() == WeekDays.Sunday){
			System.out.println("周末休息");
		}else{
			System.out.println("周末不休息");
		}
		
		
//		ordinal() 
//        返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。
		
		System.out.println(WeekDays.Saturday.ordinal());
		System.out.println(WeekDays.Saturday.name());
		
		WeekDays[] values = WeekDays.values();
		for (WeekDays days : values) {
			System.out.println(days.toString());
			System.out.println(days.ordinal());
		}
		
	}

}
