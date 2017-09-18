package com.etcxm._03test;

import com.etcxm._02Utils.CustomDBUtil;

public class CustomTest {
	public static void main(String[] args) {
		CustomDBUtil util = new CustomDBUtil();
		
		String sql = "UPDATE t_student SET name = ?,age = ? WHERE id = ?";
		
		boolean isOk = util.updateByPerpard(sql,"jack",30,1);
		if(isOk){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
		
		
	}

}
