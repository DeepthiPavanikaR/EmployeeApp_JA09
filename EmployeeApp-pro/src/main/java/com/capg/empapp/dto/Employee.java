package com.capg.empapp.dto;

public class Employee {
	
	private int employeeId;
	private String name;
	private int exp;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeId, int exp) {
		super();
		this.employeeId = employeeId;
		this.exp = exp;
	}


	public Employee(int employeeId, double salary) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
	}


	public Employee(int employeeId, String name, int exp, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.exp = exp;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", exp=" + exp + ", salary=" + salary + "]";
	}
	
	

}
