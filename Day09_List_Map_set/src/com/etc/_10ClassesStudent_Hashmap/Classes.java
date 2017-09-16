package com.etc._10ClassesStudent_Hashmap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


/**
 * 班级类
 * @author Administrator
 *
 */
public class Classes {
	//集合中,只能存放引用(对象)类型,不能存放基本数据类型
	//Object
	
	//Map  存放学生   key:id(String类型)   value:stu(Student类型)
	private HashMap<String,Student> stus = new HashMap<String, Student>();
	
	//1.添加学生
	public void add(Student stu){
		if(stu==null){
			System.out.println("该学生对象是空的,不能添加");
		}else{
			stus.put(stu.getId(), stu);//添加学生       value 学生  key 学生的id
			System.out.println(stu.getName()+"添加成功");
		}
	}
	//2.查询学生  指定查询 通过name来查询
	//传入学生名字  返回一个学生
	public Student queryStudent(String name){
		
		for (String key : stus.keySet()) {
			//根据key获取value
			Student student = stus.get(key);
			if(student.getName().equals(name)){
				return student;
			}
		}
		return null;
	}
	
	
	
	//3.删除学生  根据ID
	public boolean deleteStudent(String id){
		Iterator<String> it = stus.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			//根据key获取value
			Student student = stus.get(key);
			if(student.getId().equals(id)){
				stus.remove(key);//map删除 要删除key
				return true;
			}
		}
		return false;
	}
	
	
	//4.全部查询
	public void showAllStudents(){
		for (Student stu : stus.values()) { //获取map中所有的value
			System.out.println(stu);
		}
	}
	 

}
