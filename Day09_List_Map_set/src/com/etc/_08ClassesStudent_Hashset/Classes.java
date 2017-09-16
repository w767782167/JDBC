package com.etc._08ClassesStudent_Hashset;


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
	
	//set  存放学生
	private HashSet<Student> stus = new HashSet<Student>();
	
	//1.添加学生
	public void add(Student stu){
		if(stu==null){
			System.out.println("该学生对象是空的,不能添加");
		}else{
			stus.add(stu);
			System.out.println("添加成功");
		}
	}
	//2.查询学生  指定查询 通过name来查询
	//传入学生名字  返回一个学生
	public Student queryStudent(String name){
		//遍历动态数组
		for (Object obj : stus) {
			Student s = (Student)obj;
			if(s.getName().equals(name)){
				return s;
			}
		}
		return null;
	}
	
	
	
	//3.删除学生  根据ID
	public boolean deleteStudent(String id){
		Iterator<Student> it = stus.iterator();
		while(it.hasNext()){
			Student student = it.next();
			if(student.getId().equals(id)){
				stus.remove(student);
				return true;
			}
		}
		return false;
	}
	
	
	//4.全部查询
	public void showAllStudents(){
		for (Student stu : stus) { //Tab
			System.out.println(stu);
		}
		
	}
	 

}
