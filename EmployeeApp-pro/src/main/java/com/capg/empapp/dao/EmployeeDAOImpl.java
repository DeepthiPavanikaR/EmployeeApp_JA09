package com.capg.empapp.dao;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exception.InvalidEmployeeIdException;
import com.capg.empapp.exception.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {

	public boolean addEmployee(Employee e) throws WrongSalaryException{
         // SQL  insert into employee ...... 
		
		//System.out.println(" =====>> DAO Impl employee "+e);
		return EmployeeDB.addEmployee(e);
	}

	public Employee[] getAllEmployees() {

		return EmployeeDB.employees;
	}
	
	//============================================================
	
	
	public boolean editSalaryByEmployeeId(int id,double empNewSalary) throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		return EmployeeDB.editSalaryByEmployeeId(id, empNewSalary);
	}

	public boolean editExpByEmployeeId(int id,int empNewExp) throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		return EmployeeDB.editExpByEmployeeId(id, empNewExp);
	}

	public Employee[] getEmployeeByExperience(int exp) {
		// TODO Auto-generated method stub
		return EmployeeDB.getEmployeeByExperience(exp);
	}

	public Employee[] getEmployeeBySalary(double salary) {
		// TODO Auto-generated method stub
		return EmployeeDB.getEmployeeBySalary(salary);
	}

	public Employee[] getEmployessBySalaryRange(double salaryRangeMin, double salaryRangeMax) {
		// TODO Auto-generated method stub
		return EmployeeDB.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

}


