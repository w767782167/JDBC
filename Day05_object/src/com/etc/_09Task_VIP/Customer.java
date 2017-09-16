package com.etc._09Task_VIP;

public class Customer {
	private String custId;
	private String name;
	private int score;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public boolean isValidate(String custId){
		if(custId.equals(this.custId)){
			return true;
		}
		return false;
	}
	
	
	public void login(String custId){
		if(isValidate(custId)){
			//折扣信息
			System.out.println("score="+score);
			if(this.score > 1000){
				System.out.println("打5折");
			}else if(this.score>500){
				System.out.println("打8折");
			}else{
				System.out.println("不打折");
			}
			//进行抽奖  Math.random()  0.0---0.9999999  
			int n = (int)(Math.random()*10+1);//1...10
			System.out.println("随机数是"+n);
			//custId包含  随机数就可以
			if(this.custId.contains(n+"")){
				System.out.println("恭喜你,找志杰领XX网址一个");
			}else{
				System.out.println("谢谢,明天再来");
			}
			
		}else{
			System.out.println("输入有错误");
			System.exit(0);//退出
		}
		
		
	}

}
