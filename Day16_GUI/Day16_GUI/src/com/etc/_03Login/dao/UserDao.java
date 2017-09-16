package com.etc._03Login.dao;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etc._03Login.entity.User;
import com.etc._03Login.utils.JDBCUtils;



public class UserDao {
	//创建一个JDBC工具对象
	private JDBCUtils jdbc = new JDBCUtils();
	public UserDao(){
		jdbc.getConnection();
	}
	
	//插入数据   注册
	public boolean addUser(User user) throws Exception{
		
		String sql = "INSERT INTO t_User (id,username,password,sex,birthday,hobby)" +
				" VALUES(null,?,?,?,?,?)";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(user.getUsername());
		params.add(user.getPassword());
		params.add(user.getSex());
		params.add(user.getBirthday());
		params.add(user.getHobby());
		boolean flag = jdbc.updateByPreparedStatement(sql, params);
		jdbc.releaseConn();
		return flag;
	}
	
	//删除数据
    public boolean deleteUser(long id) throws Exception{
		
		String sql = "DELETE FROM t_User WHERE id = ?";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(id);
		boolean flag = jdbc.updateByPreparedStatement(sql, params);
		jdbc.releaseConn();
		return flag;
	}
	
	
	//登录   查询一个
	public User queryUserByNameAndPwd(String userName,String password) 
			throws Exception{
		String sql = "SELECT * FROM t_User WHERE username = ? AND password = ?";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(userName);
		params.add(password);
		
		User user = jdbc.findSimpleRefResult(sql, params, User.class);
		
		jdbc.releaseConn();
		return user;
	}
	
	//查询所有的用户
	public List<User> queryAllUser() throws Exception{
		String sql = "SELECT * FROM t_User";
		ArrayList<Object> params = new ArrayList<Object>();
		List<User> list = jdbc.findMoreRefResult(sql, params, User.class);
		jdbc.releaseConn();
		return list;
	}
	
	//查询 名字 相关 的用户
	public List<User> queryUserByLike(String name) throws Exception{
		String sql = "SELECT * FROM t_User WHERE username LIKE ?";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(name);
		List<User> list = jdbc.findMoreRefResult(sql, params, User.class);
		jdbc.releaseConn();
		return list;
	}
	
	
	

}
