package com.capg.empapp.db;

import com.capg.empapp.dto.Employee;

public class EmployeeDB {
	// Employee cannot be resolved to a type
	public static Employee employees[]  = new Employee[100];
	
	public static int count = 0;
	
	static {
		
		employees[count++] = 	new Employee(101, "ramesh", 8, 1000);
		employees[count++] = 	new Employee(102, "suresh", 2, 3000);
		employees[count++] = 	new Employee(103, "rakesh", 1, 5000);
		employees[count++] = 	new Employee(104, "lokesh", 5, 7000);
		
		}
		
		
	public static boolean addEmployee(Employee e)
	{
		
		employees[count++] = e;
	
		return true;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public static boolean editExpByEmployeeId(int id,int exp) {
		for(int i=0;i<count;i++) {
			if(employees[i].getEmployeeId()==id){
				employees[i].setExp(exp);
				return true;
			}
		}
		return false;
	}
	
	public static boolean editSalaryByEmployeeId(int id,double sal) {
		for(int i=0;i<count;i++) {
			if(employees[i].getEmployeeId()==id){
				employees[i].setSalary(sal);
				return true;
			}
		}
		return false;
	}
	
	public static Employee[] getEmployeeByExperience(int exp) {
		for(int i=0;i<count;i++) {
			if(employees[i].getExp()==exp) {
				System.out.println(employees[i]);
			}
		}return null;
	}
	
	public static Employee[] getEmployeeBySalary(double salary) {
		for(int i=0;i<count;i++) {
			if(employees[i].getSalary()==salary) {
				System.out.println(employees[i]);
			}
		}return null;
	}
	
	public static Employee[] getEmployessBySalaryRange(double salaryRangeMin, double salaryRangeMax) {
		for(int i=0;i<count;i++) {
			if(employees[i].getSalary()>=salaryRangeMin && employees[i].getSalary()<=salaryRangeMax) {
				System.out.println(employees[i]);
			}
		}return null;
	}
}