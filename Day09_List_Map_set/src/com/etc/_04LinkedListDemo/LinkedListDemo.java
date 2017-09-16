package com.etc._04LinkedListDemo;

import java.util.LinkedList;

/**
 * Linkedlist 链表
 * @author Administrator
 *
 */

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list	 = new LinkedList();
		//添加
		list.add("小白");
		list.add("小黑");
		list.addFirst("小绿");
		list.addLast("小红");
		
		
		System.out.println(list);
		
		//删除
		//list.remove(0);//下标
		list.remove("小白");//元素
		System.out.println(list);
	}

}
