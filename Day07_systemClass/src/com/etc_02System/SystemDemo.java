package com.etc_02System;

import java.util.Arrays;

public class SystemDemo {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("被回收了......");
	}
	
	public static void main(String[] args) {
//		1.数组拷贝
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		
		int[] srcArray = {1,2,3,4,5,6,7,8,9};
		int[] destArray = new int[10];
		System.out.println(Arrays.toString(destArray));
		System.arraycopy(srcArray, 2, destArray, 5, 3);
		System.out.println(Arrays.toString(destArray));
		
//		2.时间戳    1970
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		
//		3.程序退出
		//System.exit(0);
		System.out.println("哈哈");
		
		
//		4.gc
		new SystemDemo();
		new SystemDemo();
		new SystemDemo();
		new SystemDemo();
		
		System.gc();
		
		//new Runtime();
		
		//Runtime.getRuntime();
		
		
		
		
		
		
		
	}
}
