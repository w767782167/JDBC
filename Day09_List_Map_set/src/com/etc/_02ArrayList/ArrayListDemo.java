package com.etc._02ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		//创建动态数组对象
		ArrayList  list = new ArrayList();
		//添加
		list.add("jack");
		list.add("rose");
		list.add("tom");
		System.out.println(list);
		
		//删除
		//list.remove(2); //通过下标
		list.remove("tom");//通过元素
		System.out.println(list);
		
		//长度
		System.out.println(list.size());
		
		//是否包含
		boolean isCon = list.contains("rose");
		System.out.println(isCon);
		
		//通过下标获取元素
		Object temp = list.get(0);
		String name = (String)temp;
		System.out.println(name);
		
		System.out.println( list.get(0));
		
		
	}

}
