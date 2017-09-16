package com.etc._06generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo02 {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Number> list2 = new ArrayList<Number>();
		List<String> list3 = new ArrayList<String>();
		List<Object> list4 = new ArrayList<Object>();
		doWork1(list1);
		
		doWork2(list1);
		doWork2(list2);
		//doWork2(list4);
		
		
		doWork3(list4);
		doWork3(list2);
	}
	
	public static void doWork1(List<?> list){
//		?通配符   类型不能确定的时候用,只能是参数
	}
	
	//泛型的上限  类型  只能是Number类型  或Number的子类
	public static void doWork2(List<? extends Number> list){
		
	}
	
	//泛型的下限  类型 只能是Number类型 或Number的父类
    public static void doWork3(List<? super Number> list){
		
	}

}
