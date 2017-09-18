package com.etc._01CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
	public static void main(String[] args) {
		//集合  list map set
		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		list.add("12");
		list.add("134");
		list.add("42");
		
		System.out.println(list);
		System.out.println("----------------");
//		1、sort : 根据元素的自然顺序对指定列表按升序进行排序
//		static 方法
//		类名.方法ming
//		Collections.sort(list);
//		System.out.println(list);
		
		//2.sort(List<T> list, Comparator<? super T> c) 
//		根据指定比较器产生的顺序对指定列表进行排序。
		
		//匿名内部类
		Collections.sort(list,new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				
				//字符串--->int
				if(Integer.parseInt(o1) < Integer.parseInt(o2)){
					return 1;
				}else if(Integer.parseInt(o1) > Integer.parseInt(o2)){
					return -1;
				}
				return 0;
			}
		});
		
		
		System.out.println(list);
		
		Collections.swap(list, 0, 3);
		System.out.println(list);
	}

}
