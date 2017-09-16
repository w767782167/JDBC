package com.etc._12Task;

public class Worker {
	private String name;
	private int age;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(String name, int age, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	
	
	public void doWork(){
		System.out.println(this.name+"在工作中......");
	}
	

}
