package com.etc._09HashMapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		// HashMap   ---key-value----  字典
//		key:z   value:zhang3
//		key:w   value:wang5
//		key:l   value:li4
		
		//创建对象
		HashMap<String, String> map = new HashMap<String, String>();
		
		
		//key是唯一的
		
		//1.如果key不存在    就是添加
		//2.如果key存在  就是修改value
		map.put("z", "zhang3");
		map.put("l", "li4");
		map.put("w", "wang5");
		
		
	//	map.put("a", "wang5");
		
		System.out.println(map);
		System.out.println(map.size());
		
		
		//获取元素  通过key获取Value
		String string = map.get("z");
		System.out.println(string);
		
		
		//遍历Map
		Set<String> s = map.keySet();//获取所有的key
		for (String key : s) {
			System.out.println("key = "+key+"  value = "+map.get(key));
		}
		
		System.out.println("----------------");
		
		Collection<String> values = map.values();//获取所有的value
		for (String value : values) {
			System.out.println(value);
		}
		
//		任务:
//		使用hashMap 完成早上的班级管理系统
		
		
	}

}
