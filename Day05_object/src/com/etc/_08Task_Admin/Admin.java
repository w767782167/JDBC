package com.etc._08Task_Admin;


//Object
public class Admin {
	private String userName;
	private String passWord;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
		this.userName = "admin";
		this.passWord = "250";
	}
	
	
	public Admin(String userName, String passWord) {
		//super(userName,passWord);  父类没有有参数的构造方法
		super();
		this.userName = userName;
		this.passWord = passWord;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void showInfo(){
		System.out.println("userName ="+userName+",passWord="+passWord);
	}
	
	//方法定义 对象.方法名
	public boolean isValidate(String userName,String passWord){
		//== 比较地址   equals 比较内容
		if(this.userName.equals(userName) && 
				this.passWord.equals(passWord)){
			return true;
		}
		return false;
	}
	
	

}
