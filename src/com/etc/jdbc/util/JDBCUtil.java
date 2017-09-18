package com.etc.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {

	//驱动语句
	public static final String DRIVER="com.mysql.jdbc.Driver";
	//连接语句
	public static final String PATH="jdbc:mysql://localhost:3306/jdbcdemo?useSSL=false";
	//用户名
	public static final String USERNAME="root";
	//密码
	public static final String USERPWD="123456";
	
	//连接对象
	Connection con;
	//语句对象
	PreparedStatement ps;
	//结果集对象
	ResultSet rs;
	
	
	/**获取连接对象
	 * @author zyy
	 * @return 连接对象
	 * @since 2017年9月12日18:48:30
	 */
	public Connection getCon(){
		
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(PATH, USERNAME, USERPWD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return con;
	}
	
	/**
	 * 关闭数据库连接方法
	 * @since 2017年9月12日18:51:20
	 * @author zyy
	 */
	public void closeAll(){
		try {
			if(rs!=null){rs.close();}
			if(ps!=null){ps.close();}
			if(con!=null){con.close();}
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	
	/**
	 * 增删改通用方法
	 * @param sql 增删改语句
	 * @param obj 需要传入到sql的参数
	 * @return    受影响行数
	 * 
	 */
	public int update(String sql,Object...obj){
		con=getCon();
		
		int result=0;
		try {
		//	con.setAutoCommit(false);// 设置为手动提交
			//实例化语句对象
			ps=con.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					ps.setObject(i+1, obj[i]);
				}
			}		
			//执行语句
			result=ps.executeUpdate();
		//	con.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll();
		}
		return result;
	}
	
	
	
	/**
	 * 查询方法
	 * @param sql  查询语句
	 * @param obj  查询语句置入的参数
	 * @return 查询结果集
	 */
	public ResultSet query(String sql,Object...obj){
		con=getCon();
		
		try {
			ps=con.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					ps.setObject(i+1, obj[i]);
				}
			}		
			
			rs=ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rs;
	}
	
	

}
