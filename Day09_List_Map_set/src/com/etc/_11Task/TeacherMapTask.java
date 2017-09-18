package com.etc._11Task;

import java.util.HashMap;
import java.util.Iterator;

public class TeacherMapTask {
	public static void main(String[] args) {
		/*1、已知某学校的教学课程内容安排如下：
		                           老师                  课程
		         Tom                 CoreJava
		         John                Java
		         Susan               MySql
		         Jerry               JDBC
		         Jim                 Unix
		         Kevin               MySql
		         Lucy                JSP
		         */
//		（1）使用一个Map，以老师的名字作为键，老师教授的课程名作为值，表示上述课程安排。
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Tom","CoreJava");
		map.put("John","Java");
		map.put("Susan","MySql");
		map.put("Jerry","JDBC");
		map.put("Jim","Unix");
		map.put("Kevin","MySql");
		map.put("Lucy","JSP");
		
		System.out.println(map);
		System.out.println("----------------");
//		（2）增加了一位新老师Allen 教Ios
		map.put("Allen","IOS");
		System.out.println(map);
		System.out.println("----------------");
//		（3）Lucy 改为教Java
		map.put("Lucy","Java");
		System.out.println(map);
		System.out.println("----------------");
//		（4）遍历Map，输出所有的老师及老师教授的课程
		for (String key : map.keySet()) {
			System.out.println("key = "+key+",value =" +map.get(key));
		}
		System.out.println("----------------");
//		（5）利用Map，输出所有教MySql的老师。
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			String key =  iterator.next();
			String value = map.get(key);
			if(value.equals("MySql")){
				System.out.println("MySql = "+key);
			}
		}

	}

}
