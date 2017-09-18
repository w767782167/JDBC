package com.etc._02txDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class BankDemo {
	public static void main(String[] args) {
		   JDBCUtils util = new JDBCUtils();
		   Connection con =  util.getConnection();
		 try {
			 
			 //-----1设置手动提交事务
			 con.setAutoCommit(false);
			 
			// 1：查询西门官人的账号是否满足转账条件 (余额>=1000)
			   String sql = "SELECT * FROM t_account WHERE name=? AND balance>= ?";
			   ArrayList<Object> params = new ArrayList<Object>();
			   params.add(0, "西门官人");
			   params.add(1,1000);
			  Account account = null;
			  account = util.findSimpleRefResult(sql, params, Account.class);
			  
			  if(account == null){
				  System.out.println("不可以去");
			  }else{
				  System.out.println("可以去");
			  }
			  
			
//		     2：从西门官人的余额中扣除金额1000
			  sql = "UPDATE t_account SET balance = balance-? WHERE name = ?";
			  params = new ArrayList<Object>();
			  params.add(0,1000);
			  params.add(1, "西门官人");
			  util.updateByPreparedStatement(sql, params);
			  
			  
			 // System.out.println(1/0);//停电
			  
//		     3：把扣除的金额1000加入到东方姑娘的余额中
			sql = "UPDATE t_account SET balance = balance+? WHERE name = ?";
			params = new ArrayList<Object>();
			params.add(0, 1000);
			params.add(1, "东方菇凉");
			util.updateByPreparedStatement(sql, params);
			
			//------2.如果没有问题,事务成功 提交事务
			con.commit();
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			//------3.如果出现异常
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
