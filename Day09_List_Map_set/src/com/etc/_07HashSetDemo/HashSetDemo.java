package com.etc._07HashSetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		
		//set  不能有重复的元素  没有顺序
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("c");
		
		System.out.println(set.size());
		
		
		//foreach
		for (String string : set) {
			System.out.println(string);
		}
		
		//迭代器
		
//		迭代器指针  刚开始是在元素的上面
	  
		/*b
		 
		c
		 
		a
		 -*/
		
		System.out.println("----------------");
		
		Iterator<String> it = set.iterator();
		//System.out.println(it.hasNext());//判断是否有下一个元素
		//System.out.println(it.next());//获取下一个元素
//		if(it.hasNext()){
//			System.out.println(it.next());	
//		}
		
		while(it.hasNext()){
			String tempStr = it.next();
			
			System.out.println(tempStr);
		}
		
		//任务
		//1.ArrayList  有没有迭代器?   有
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("A");
		
		System.out.println(list.size());
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
		
		
		//2.使用HashSet 完成早上的班级管理系统
		
		
		
		
	}

}
