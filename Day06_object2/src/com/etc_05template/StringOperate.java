package com.etc_05template;

public class StringOperate extends OperateTimeTemplate{

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 0; i < 20000; i++) {
			str += i;
		}
	}
	
	
	
//	public long doWork() {
//
//		long begintime = System.currentTimeMillis();// 1970
//		String str = "";
//		for (int i = 0; i < 20000; i++) {
//			str += i;
//		}
//		long endtime = System.currentTimeMillis();// 1970
//
//		return endtime - begintime;
//	}

}
