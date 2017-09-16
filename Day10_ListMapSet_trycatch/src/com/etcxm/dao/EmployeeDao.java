package com.etcxm.dao;

import java.util.Collection;
import java.util.HashMap;

import com.etcxm.entity.Employee;

/**
 * 操作员工的类
 * @author Administrator
 *
 */
public class EmployeeDao {
	//创建一个HashMap
	HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
	//1.添加
	public void addEmployee(Employee employee){
		if(employee == null){
			System.out.println("employee不能为空");
			return;
		}
		
		if(map.containsKey(employee.getEno())){//map中是否包含这个对象key
			System.out.println("该编号已经存在,不能添加");
		}else{
			map.put(employee.getEno(), employee);
			System.out.println("员工:"+employee.getEname()+"添加成功");
		}
	}
	
	//2.删除
	public boolean deleteEmployee(int eno){
		if(map.containsKey(eno)){
			map.remove(eno);
			return true;
		}
		return false;
	}
	
	//3.修改
	public void updateEmployee(Employee employee){
		if(map.containsKey(employee.getEno())){
			map.put(employee.getEno(), employee);
		}else{
			System.out.println("找不到这个人,无法修改");
		}
		
	}
	
	
	
	//4.查找
	public void showAllEmployee(){
		Collection<Employee> values = map.values();
		for (Employee employee : values) {
			System.out.println(employee);
		}
	}

}
