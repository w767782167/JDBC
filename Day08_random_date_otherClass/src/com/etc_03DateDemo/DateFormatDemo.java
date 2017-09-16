package com.etc_03DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDemo {
	
	public static void main(String[] args)  {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toLocaleString());
		
		//2017年08月23号       2017/08/23
		
        //格式化(format):  Date类型对象------->String类型:    String format(Date date) 
		
		SimpleDateFormat  sdformat = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		String string = sdformat.format(date);
		System.out.println(string);
		
       // 解析(parse):     String类型时间------>Date类型     :    Date parse(String source)  
		SimpleDateFormat  sdformat1 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("请输入时间 yyyy/MM/dd");
		Scanner sc = new Scanner(System.in);
		String dateString = sc.next();
		try {
			Date date2 = sdformat1.parse(dateString);
			System.out.println(date2.toLocaleString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
