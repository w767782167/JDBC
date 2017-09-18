package com.etc_03DateDemo;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		//创建对象
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		System.out.println("年="+calendar.get(Calendar.YEAR));
		System.out.println("月="+(calendar.get(Calendar.MONTH)+1));//月份  0--11
		System.out.println("日="+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("时="+calendar.get(Calendar.HOUR_OF_DAY));//24  12
		System.out.println("分="+calendar.get(Calendar.MINUTE));
		System.out.println("秒="+calendar.get(Calendar.SECOND));
		
	}

}
