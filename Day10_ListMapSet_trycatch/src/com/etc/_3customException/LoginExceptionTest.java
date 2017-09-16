package com.etc._3customException;

public class LoginExceptionTest {
	
	private static String[] names = {"jack","rose","tim"};
	public static void main(String[] args) {
		 try {
			checkUserName("jack");
			System.out.println("注册成功");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("给用户看:"+e.getMessage());
		}
		
	}
	
	public static boolean checkUserName(String userName){
		
		for (String name : names) {
			if(name.equals(userName)){
				//return false;
				throw new LoginException("亲,"+name+"已经存在了");
			}
		}
		return true;
	}

}
