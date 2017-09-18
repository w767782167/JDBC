package com.etc_06enumDemo;


//Monday=忙day
//
//Tuesday=求死day
// 
//Wednesday=未死day
// 
//Thursday=受死day
// 
//Friday=福来day
// 
//Saturday=洒脱day
// 
//Sunday=赏day

//class WeekDays{
//	public static final int Monday = 1;
//	public static final int Tuesday = 2;
//	public static final int Wednesday = 3;
//	public static final int Thursday = 4;
//	public static final int Friday = 5;
//	public static final int Saturday = 6;
//	public static final int Sunday = 7;
//}


//class WeekDays{
//	private WeekDays(){
//		
//	}
//	public static final WeekDays Monday = new WeekDays();
//	public static final WeekDays Tuesday = new WeekDays();
//	public static final WeekDays Wednesday = new WeekDays();
//	public static final WeekDays Thursday = new WeekDays();
//	public static final WeekDays Friday = new WeekDays();
//	public static final WeekDays Saturday = new WeekDays();
//	public static final WeekDays Sunday = new WeekDays();
//}

enum WeekDays{
	
	 Monday, Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday; 
}

public class Employee {
//	private int restday;
//
//	public int getRestday() {
//		return restday;
//	}
//
//	public void setRestday(int restday) {
//		this.restday = restday;
//	}
	
	private WeekDays restday;

	public WeekDays getRestday() {
		return restday;
	}

	public void setRestday(WeekDays restday) {
		this.restday = restday;
	}
	
	
	

}
