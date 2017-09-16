package com.etc_03DateDemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarAndDate {
	public static void main(String[] args) {
		
		//date----->Calendar
		Date date = new Date();
		//自己设置时间
		date.setYear(1994-1900);
		date.setMonth(8-1);//0-11
		date.setDate(1);
		System.out.println(date.toLocaleString());
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(c);
		
		
		//calendar------>date
		//时间戳+用户名+id
		c.getTimeInMillis();
		
		Date date1 = new Date(c.getTimeInMillis());
		System.out.println(date1.toLocaleString());
		
		
		
		
		
	}

}
