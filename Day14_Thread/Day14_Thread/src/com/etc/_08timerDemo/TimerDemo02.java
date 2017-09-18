package com.etc._08timerDemo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo02 {
	public static void main(String[] args) {
		System.out.println("begin....");
		
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//System.out.println("你好,师姐");
				Date d = new Date();
				System.out.println(d.toLocaleString());
			}
		}, 2000, 1000);
		
		System.out.println("end.....");
	}

}
