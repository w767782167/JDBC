package com.etcxm.test;

import com.etcxm.dao.EmployeeDao;
import com.etcxm.entity.Employee;

public class Test {
	public static void main(String[] args) {
		//main 代码越少越好
		Employee e1 = new Employee(1, "Boss", "jack", '男', 10);
		Employee e2 = new Employee(2, "秘书", "tom", '男', 100000000d);
		
		
		EmployeeDao dao = new EmployeeDao();
		//添加
		dao.addEmployee(e1);
		dao.addEmployee(e2);
		
		dao.showAllEmployee();
		
		System.out.println("----------------");
		//修改
		Employee e3 = new Employee(2, "秘书", "rose", '女', 10000d);
		dao.updateEmployee(e3);
		
		dao.showAllEmployee();
		
	}

}
