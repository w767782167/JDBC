package com.etc_05template;

public class IntOperate extends OperateTimeTemplate{

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		long sum = 0;
		for(int i = 0;i<5000000;i++){
			sum += i;
		}
	}
	
//	public long doWork(){
//		
//		long begintime = System.currentTimeMillis();//1970
//		long sum = 0;
//		for(int i = 0;i<5000000;i++){
//			sum += i;
//		}
//		long endtime = System.currentTimeMillis();//1970
//		
//		return endtime-begintime;
//	}

}
