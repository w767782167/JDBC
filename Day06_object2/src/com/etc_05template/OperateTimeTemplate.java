package com.etc_05template;

public abstract class OperateTimeTemplate {
	
	public long getTotalTime() {

		long begintime = System.currentTimeMillis();// 1970
		
		this.doWork();//子类不同的实现
		
		long endtime = System.currentTimeMillis();// 1970

		return endtime - begintime;
	}
	
	public abstract void doWork();
	
	

}
