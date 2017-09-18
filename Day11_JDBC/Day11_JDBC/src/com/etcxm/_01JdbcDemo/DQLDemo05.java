package com.etcxm._01JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DQLDemo05 {
//	需求:查询product表中有多少条数据
	public static void testCount() throws Exception{
		String sql = "SELECT COUNT(id) total FROM product";
		
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取语句对象
		Statement statement = con.createStatement();
		
//		4.执行SQL
		ResultSet resultSet = statement.executeQuery(sql);
	  /*+-------+
		| total |
		+-------+
		|    21 |
		+-------+*/
	    if(resultSet.next()){  //是否有下一条数据
	    	//a.通过下标获取元素
	    	long ret1 = resultSet.getLong(1);
	    	System.out.println(ret1);
	    	
	    	//b.通过列名获取元素
//	    	long ret2 = resultSet.getLong("COUNT(id)");
//	    	System.out.println(ret2);
	    	
	    	long ret2 = resultSet.getLong("total");
	    	System.out.println(ret2);
	    }
		
//		5.释放资源close()
		statement.close();
		con.close();
	}
	

	
//	需求:查询product表中id为10的数据
	public static void testOne() throws Exception{
		String sql = "SELECT * FROM product WHERE id = 10";
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取语句对象
		Statement statement = con.createStatement();
		
//		4.执行SQL
		ResultSet resultSet = statement.executeQuery(sql);
//		+----+-------------+--------+-----------+----------+-------+--------+-----------+
//		| id | productName | dir_id | salePrice | supplier | brand | cutoff | costPrice |
//		+----+-------------+--------+-----------+----------+-------+--------+-----------+
//		| 10 | 罗技M310    |      2 |       135 | 罗技     | 罗技  |   0.92 |      69.8 |
//		+----+-------------+--------+-----------+----------+-------+--------+-----------+
	    if(resultSet.next()){  //是否有下一条数据
	    	//a.通过下标获取元素
//	    	long id1 = resultSet.getLong(1);
//	    	System.out.println(id1);
//	    	
//	    	String productName1 = resultSet.getString(2);
//	    	System.out.println(productName1);
//	    	
//	    	double salePrice = resultSet.getDouble(4);
//	    	System.out.println(salePrice);
	    	
	    	//b.通过列名获取元素   推荐使用
	    	long id2 = resultSet.getLong("id");
	    	System.out.println(id2);
	    	
	    	String productName2 = resultSet.getString("productName");
	    	System.out.println(productName2);
	    	
	    	double salePrice2 = resultSet.getDouble("salePrice");
	    	System.out.println(salePrice2);
	    }
		
//		5.释放资源close()
		statement.close();
		con.close();
	}
	
//	需求:查询product表中所有商品的数据
	public static void testAll() throws Exception{
		String sql = "SELECT * FROM product";
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取语句对象
		Statement statement = con.createStatement();
//		4.执行SQL
		ResultSet resultSet = statement.executeQuery(sql);

	   while(resultSet.next()){  //是否有下一条数据
	    	//b.通过列名获取元素   推荐使用
	    	long id2 = resultSet.getLong("id");
	    	
	    	Object productName2 = resultSet.getObject("productName");
	    	//Object--->String
	    	double salePrice2 = resultSet.getDouble("salePrice");
	    	System.out.println(id2+","+productName2+","+salePrice2);
	    }
		
//		5.释放资源close()
		statement.close();
		con.close();
	}

	
	public static void main(String[] args) throws Exception {
		//testCount();
		
		//testOne();
		
		testAll();
	}

}
