package com.etc_03DateDemo;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();//当前时间
		System.out.println(d);
		System.out.println(d.toLocaleString());
		
		
		//long------>date
	     long time = System.currentTimeMillis();
	     System.out.println(time);
	     
	     Date date1 = new Date(1203193471206L);
	     System.out.println(date1.toLocaleString());
		
		
		//date----->long
	     Date date2 = new Date();//当前时间
	     long time2 = date2.getTime();
	     System.out.println(time2);
	     
		
		
		
		
		
		
	}

}
