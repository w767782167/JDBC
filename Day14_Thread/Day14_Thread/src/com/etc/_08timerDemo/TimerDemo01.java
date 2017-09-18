package com.etc._08timerDemo;

import java.util.Timer;
import java.util.TimerTask;

class TimerTest extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("你好,师姐");
	}
	
}

public class TimerDemo01 {
	
	public static void main(String[] args) {
		System.out.println("begin.....");
		
		Timer t = new Timer(); 
		t.schedule(new TimerTest(), 3000);//延迟3秒执行
		
		System.out.println("end.....");
	}

}
