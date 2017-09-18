package com.etc.jdbc.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.etc.jdbc.util.JDBCUtil;

public class Test {
	
	
	public static void main(String[] args) {
		
		JDBCUtil util=new JDBCUtil();
		
//		int i=util.update("insert into t_user2(user_name,user_age,user_pwd) values(?,?,?)", "围裙妈妈",30,"123");
		
//		if(i>0){
//			System.out.println("添加成功");
//		}else{
//			System.out.println("添加失败");
//		}
//		
	ResultSet rs=	util.query("select * from t_dept");
	try {
		while(rs.next()){
			System.out.println(rs.getString("dept_name"));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	finally{
		util.closeAll();
	}
	
	
	
	
	}

}
