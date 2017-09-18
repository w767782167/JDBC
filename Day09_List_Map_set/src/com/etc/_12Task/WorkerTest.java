package com.etc._12Task;

import java.util.ArrayList;
import java.util.Iterator;

public class WorkerTest {
	public static void main(String[] args) {
//		2、设计一个程序员类（Worker），他有三个属性:姓名，年龄，工资。
//		•	 a、创建一个可变数组，在数组中增加三个程序员，基本信息（如下图）；
		Worker w1 = new Worker("zhang3",18,5500.0f);
		Worker w2 = new Worker("li4",24,8500.0f);
		Worker w3 = new Worker("wang5",23,9500.0f);
		
		ArrayList<Worker> list = new ArrayList<Worker>();
		list.add(w1);
		list.add(w2);
		list.add(w3);
		System.out.println(list);
		System.out.println("----------------");
		
//		•	 b、在li4之前插入一个程序员，信息为：“姓名：zhao6，年龄：24，工资9000”；
		Worker w4 = new Worker("zhao6",24,9000.0f);
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			Worker worker = list.get(i);
			if(worker.getName().equals("li4")){
				index = i;
				break;
			}
		}
//		add(int index, E element)   将指定的元素插入此列表中的指定位置。
		list.add(index,w4);
		System.out.println(list);
		System.out.println("----------------");
		
//		•	 c、删除wang5的信息；
		//list.remove(w3);//1.通过元素删除
		//2.通过下标删除
		for (int i = 0; i < list.size(); i++) {
			Worker worker = list.get(i);
			if(worker.getName().equals("wang5")){
				list.remove(i);
				break;
			}
		}
		
		System.out.println(list);
		System.out.println("----------------");
		
//		•	 d、利用for循环遍历，打印List中所有工人的信息；
		for (Worker worker : list) {
			System.out.println(worker);
		}
		System.out.println("----------------");
//		•	 e、利用迭代遍历，对List中所有的工人调用work方法。
		Iterator<Worker> iterator = list.iterator();
		while(iterator.hasNext()){
			Worker w= iterator.next();
			w.doWork();
		}

	}

}
