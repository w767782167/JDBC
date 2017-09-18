package com.etc._01oldDriverDemo;

import java.util.ArrayList;

public class DriverTest {
	public static void main(String[] args) {
		
		OldDriver od = new OldDriver();
		od.setName("志杰");
		
		//一个
		//od.setGrilfriend(g);
		
		Gril g1 = new Gril("李冰冰");
		Gril g2 = new Gril("范冰冰");
		Gril g3 = new Gril("冷冰冰");
		Gril g4 = new Gril("如花");
		
		
		//普通数组
//		Gril[] grils = {g1,g2,g3,g4};
//		
//		od.setGrilfriends(grils);
		
		//动态数组
		ArrayList gs = new ArrayList();
		gs.add(g4);//添加
		gs.add(g1);
		gs.add(g2);
		gs.add(g3);
		
		
		od.setGrilfriends(gs);
		
		System.out.println(od);
		
		
		od.sayGoodBye();
		System.out.println(od);
		
		
		
		
		
		
	}

}
