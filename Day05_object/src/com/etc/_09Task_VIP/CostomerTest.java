package com.etc._09Task_VIP;

/*
2、 
•编写会员类: 
•编写测试类:  
•接收控制台用户输入会员号、
会员姓名、积分，创建一个会员对象，
验证会员号是否合法，不合法提示退出，
合法保存会员数据，同时显示当前用户的折扣信息，
最后进行抽奖，提示是否是幸运用户。
*/


public class CostomerTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustId("12578");
		c.setName("rose");
		c.setScore(1200);
		
		c.login("12578");
		
	}

}
