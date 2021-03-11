package com.capg.empapp.dao;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.exception.InvalidEmployeeIdException;
import com.capg.empapp.exception.WrongSalaryException;

public interface IEmployeeDAO {
	
	 public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id,double salary)throws InvalidEmployeeIdException;
	 
	 public boolean editExpByEmployeeId(int id,int exp)throws InvalidEmployeeIdException;
	 
	 public Employee[] getAllEmployees();
	 
	 public Employee[] getEmployeeBySalary(double salary);
	 
	 public Employee[] getEmployeeByExperience(int exp);
	 
	 public Employee[] getEmployessBySalaryRange(double salaryRangeMin,double salaryRangeMax);

}