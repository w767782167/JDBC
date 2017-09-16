package com.etcxm.entity;

public class Employee {
	private int eno;
	private String ejob;
	private String ename;
	private String  esex;
	private  double eSalary;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEjob() {
		return ejob;
	}
	public void setEjob(String ejob) {
		this.ejob = ejob;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eno, String ejob, String ename, String esex,
			double eSalary) {
		super();
		this.eno = eno;
		this.ejob = ejob;
		this.ename = ename;
		this.esex = esex;
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ejob=" + ejob + ", ename=" + ename
				+ ", esex=" + esex + ", eSalary=" + eSalary + "]\n";
	}
	
	

}
