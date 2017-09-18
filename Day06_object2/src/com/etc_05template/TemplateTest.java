package com.etc_05template;

public class TemplateTest {
	public static void main(String[] args) {
		IntOperate io = new IntOperate();
		//long time1 = io.doWork();
		System.out.println(io.getTotalTime());
		
		StringOperate so = new StringOperate();
		//long time2 = so.doWork();  //ctrl+1
		System.out.println(so.getTotalTime());
	}

}
